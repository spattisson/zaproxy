/*
 * Zed Attack Proxy (ZAP) and its related class files.
 *
 * ZAP is an HTTP/HTTPS proxy for assessing web application security.
 *
 * Copyright 2014 The ZAP Development Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.zaproxy.zap.extension.api;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Year;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

public class NodeJSAPIGenerator extends AbstractAPIGenerator {

    /** Default output directory in zap-api-nodejs project. */
    private static final String DEFAULT_OUTPUT_DIR = "../zap-api-nodejs/src/";

    private final String HEADER =
            "/* Zed Attack Proxy (ZAP) and its related class files.\n"
                    + " *\n"
                    + " * ZAP is an HTTP/HTTPS proxy for assessing web application security.\n"
                    + " *\n"
                    + " * Copyright "
                    + Year.now()
                    + " the ZAP development team\n"
                    + " *\n"
                    + " * Licensed under the Apache License, Version 2.0 (the \"License\");\n"
                    + " * you may not use this file except in compliance with the License.\n"
                    + " * You may obtain a copy of the License at\n"
                    + " *\n"
                    + " *   http://www.apache.org/licenses/LICENSE-2.0\n"
                    + " *\n"
                    + " * Unless required by applicable law or agreed to in writing, software\n"
                    + " * distributed under the License is distributed on an \"AS IS\" BASIS,\n"
                    + " * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n"
                    + " * See the License for the specific language governing permissions and\n"
                    + " * limitations under the License.\n"
                    + " */\n"
                    + "\n\n";

    /** Map any names which are reserved in java to something legal */
    private static final Map<String, String> nameMap;

    static {
        Map<String, String> initMap = new HashMap<>();
        initMap.put("break", "brk");
        initMap.put("boolean", "bool");
        initMap.put("continue", "cont");
        nameMap = Collections.unmodifiableMap(initMap);
    }

    public NodeJSAPIGenerator() {
        super(DEFAULT_OUTPUT_DIR);
    }

    public NodeJSAPIGenerator(String path, boolean optional) {
        super(path, optional);
    }

    public NodeJSAPIGenerator(String path, boolean optional, ResourceBundle resourceBundle) {
        super(path, optional, resourceBundle);
    }

    /**
     * Generates the API client files of the given API implementors.
     *
     * @param implementors the implementors
     * @throws IOException if an error occurred while generating the APIs.
     * @deprecated (2.6.0) Use {@link #generateAPIFiles(List)} instead.
     */
    @Deprecated
    public void generateNodeJSFiles(List<ApiImplementor> implementors) throws IOException {
        this.generateAPIFiles(implementors);
    }

    private void generateNodeJSElement(
            ApiElement element, String component, String type, Writer out) throws IOException {
        String className = createClassName(component);
        boolean hasParams = false;

        // Add description if defined
        String descTag = element.getDescriptionTag();
        try {
            String desc = getMessages().getString(descTag);
            out.write("/**\n");
            out.write(" * " + desc + "\n");
            if (isOptional()) {
                out.write(" * " + OPTIONAL_MESSAGE + "\n");
            }
            out.write(" **/\n");
        } catch (Exception e) {
            // Might not be set, so just print out the ones that are missing
            System.out.println("No i18n for: " + descTag);
            if (isOptional()) {
                out.write("/**\n");
                out.write(" * " + OPTIONAL_MESSAGE + "\n");
                out.write(" **/\n");
            }
        }

        out.write(
                className + ".prototype." + createMethodName(element.getName()) + " = function (");

        if (element.getMandatoryParamNames() != null) {
            for (String param : element.getMandatoryParamNames()) {
                if (!hasParams) {
                    hasParams = true;
                } else {
                    out.write(", ");
                }
                out.write(safeName(param.toLowerCase()));
            }
        }
        if (element.getOptionalParamNames() != null) {
            for (String param : element.getOptionalParamNames()) {
                if (!hasParams) {
                    hasParams = true;
                } else {
                    out.write(", ");
                }
                out.write(safeName(param.toLowerCase()));
            }
        }
        if (hasParams) {
            out.write(", ");
        }
        out.write("callback) {\n");

        // , {'url': url}))
        StringBuilder reqParams = new StringBuilder();
        if (hasParams) {
            reqParams.append("{");
            boolean first = true;
            if (element.getMandatoryParamNames() != null) {
                for (String param : element.getMandatoryParamNames()) {
                    if (first) {
                        first = false;
                    } else {
                        reqParams.append(", ");
                    }
                    reqParams.append("'" + param + "' : " + safeName(param.toLowerCase()));
                }
            }
            reqParams.append("}");

            if (element.getOptionalParamNames() != null
                    && !element.getOptionalParamNames().isEmpty()) {
                out.write("  const params = ");
                out.write(reqParams.toString());
                out.write(";\n");
                reqParams.replace(0, reqParams.length(), "params");

                for (String param : element.getOptionalParamNames()) {
                    out.write(
                            "  if ("
                                    + safeName(param.toLowerCase())
                                    + " && "
                                    + safeName(param.toLowerCase())
                                    + " !== null) {\n");
                    out.write(
                            "    params['"
                                    + param
                                    + "'] = "
                                    + safeName(param.toLowerCase())
                                    + ";\n");
                    out.write("  }\n");
                }
            }
        }

        String methodCb = (type.equals(OTHER_ENDPOINT)) ? "requestOther" : "request";
        String methodP = (type.equals(OTHER_ENDPOINT)) ? "requestPromiseOther" : "requestPromise";

        // Is the consumer in callback or promise mode
        out.write("  if (typeof callback === 'function') {\n");
        out.write(
                "    this.api."
                        + methodCb
                        + "('/"
                        + component
                        + "/"
                        + type
                        + "/"
                        + element.getName()
                        + "/'");
        if (hasParams) {
            out.write(", ");
            out.write(reqParams.toString());
        }
        out.write(", callback);\n");
        out.write("    return;\n");
        out.write("  }\n");
        out.write(
                "  return this.api."
                        + methodP
                        + "('/"
                        + component
                        + "/"
                        + type
                        + "/"
                        + element.getName()
                        + "/'");
        if (hasParams) {
            out.write(", ");
            out.write(reqParams.toString());
        }
        out.write(");\n");

        out.write("};\n\n");
    }

    private static String safeName(String name) {
        if (nameMap.containsKey(name)) {
            return nameMap.get(name);
        }
        return name;
    }

    private static String createFileName(String name) {
        return safeName(name) + ".js";
    }

    private static String createMethodName(String name) {
        return removeAllFullStopCharacters(safeName(name));
    }

    private static String createClassName(String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    private static String removeAllFullStopCharacters(String string) {
        return string.replaceAll("\\.", "");
    }

    @Override
    protected void generateAPIFiles(ApiImplementor imp) throws IOException {
        String className = createClassName(imp.getPrefix());

        Path file = getDirectory().resolve(createFileName(imp.getPrefix()));
        System.out.println("Generating " + file.toAbsolutePath());
        try (BufferedWriter out = Files.newBufferedWriter(file, StandardCharsets.UTF_8)) {
            out.write(HEADER);
            out.write("'use strict';\n\n");

            out.write("/**\n");
            out.write(" * This file was automatically generated.\n");
            out.write(" */\n");
            out.write("function " + className + "(clientApi) {\n");
            out.write("  this.api = clientApi;\n");
            out.write("}\n\n");

            for (ApiElement view : imp.getApiViews()) {
                this.generateNodeJSElement(view, imp.getPrefix(), VIEW_ENDPOINT, out);
            }
            for (ApiElement action : imp.getApiActions()) {
                this.generateNodeJSElement(action, imp.getPrefix(), ACTION_ENDPOINT, out);
            }
            for (ApiElement other : imp.getApiOthers()) {
                this.generateNodeJSElement(other, imp.getPrefix(), OTHER_ENDPOINT, out);
            }
            out.write("module.exports = " + className + ";\n");
        }
    }

    public static void main(String[] args) throws Exception {
        // Command for generating a nodejs version of the ZAP API

        NodeJSAPIGenerator wapi = new NodeJSAPIGenerator();
        wapi.generateCoreAPIFiles();
    }
}
