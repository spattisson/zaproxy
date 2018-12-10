# How can I run ZAP with a high DPI display?

If ZAP is displayed in a really tiny window then its probably because you have a high DPI display.

The solution is easy - use Java 9+

If you need to have multiple versions of Java on Windows then you may find it difficult to specify which one should be used. However creating a batch file which launches the ZAP jar with the right version of Java appears to be the trick, e.g.:
```
"C:\Program Files\Java\jdk-11.0.1\bin\java" -jar zap-2.7.0.jar
```

If you can only use Java 8 on Windows 10 then you can set the compatibility settings:

![image](https://user-images.githubusercontent.com/3179932/45785579-c6a12080-bc64-11e8-92c4-9860a1437c4e.png)

Finally, if all else fails, you can increase the Font Size via the ZAP Options / Display - this will also scale all of the images as well, although some graphical elements such as checkboxes and tree expand/collapse controls may not scale.

If none of these solutions work for you then raise an [issue](https://github.com/zaproxy/zaproxy/issues/new) stating exactly which system and versions of Java your are using.

---

[Back to the FAQ](FAQtoplevel)