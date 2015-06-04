Create a view plugin within the new view plugin interface.


# Introduction

We will go through the process of creating a plugin to view details of an http request. The plugin will simple show the whole http message details in one text area.

The new class has to implement PluginInterface:
```
public interface PluginInterface {
	// Name of the plugin for internal reference.
	public String getName();
	
	// Plugin has to provide the button which is displayed in the HttpPanel to select this view
	public JButton getButton();
	
	// Plugin needs to provide a anel with main content which is displayed in HttpPanel
	public JPanel getMainPanel();
	
	// Plugin can provide an additional panel which is displayed in the HttpPanel header when this view is selected
	public JPanel getOptionsPanel();
	
	// Set a new HttpMessage for this Plugin
	// For example, the user selects a new message in the history tab. 
	// The plugin should update it's models accordingly.
	public void setHttpMessage(HttpMessage httpMessage);
	
	// The plugin is requested to load data from HttpMessage into the current UI.
	// For example, the user selects a new message in the history tab. 
	public void load();
	
	// The plugin is requested to save data from the UI into the current HttpMessage.
	// For example, the user selects a new message in the history tab. Or in break mode, want to send the modified message. 
	public void save();
	
	
	// Optional
	public void clearView(boolean enableViewSelect);
	
	public void searchHeader(Pattern p, List<SearchMatch> matches);
	public void searchBody(Pattern p, List<SearchMatch> matches);
	
	public void highlightHeader(SearchMatch sm);
	public void highlightBody(SearchMatch sm);
}
```

Create class RequestAllView within package  org.zaproxy.zap.extension.httppanel.plugin.request.all:

```
public class RequestAllView implements PluginInterface, ActionListener {
	public RequestAllView(HttpPanel httpPanel, HttpMessage httpMessage) {
		this.httpPanel = httpPanel;
		this.httpMessage = httpMessage;
		initModel();
		initUi();
		switchView(textView.getName());
	}
	
	private void initModel() {
		modelText = new RequestAllModelText(httpMessage);
		modelHex = new RequestAllModelText(httpMessage);
	}
	
	private void initUi() {
		// Common
		buttonShowView = new JButton(this.Name);

		// Main Panel
		panelMain = new JPanel();
		panelMain.setLayout(new CardLayout());
		
		// Plugins
		textView = new HttpPanelTextView(modelText, MessageType.All, httpPanel.isEditable());
		hexView = new HttpPanelHexView(modelText, MessageType.All, httpPanel.isEditable());
		
		views.put(textView.getName(), textView);
		views.put(hexView.getName(), hexView);
		
		panelMain.add(textView.getPane(), textView.getName());
		panelMain.add(hexView.getPane(), hexView.getName());
		
		// Combobox
		comboxSelectView = new JComboBox();
		comboxSelectView.addItem(textView.getName());
		comboxSelectView.addItem(hexView.getName());
		comboxSelectView.addActionListener(this);
		
		panelOptions = new JPanel();
		panelOptions.add(comboxSelectView);
		
		httpPanel.addHttpDataView(this);
	}
	
	private void switchView(String name) {
		this.currentView = views.get(name);		
        CardLayout card = (CardLayout) panelMain.getLayout();
        card.show(panelMain, name);	
	}

	@Override
	public String getName() {
		return "All";
	}

	@Override
	public JButton getButton() {
		return buttonShowView;
	}

	@Override
	public JPanel getOptionsPanel() {
		return panelOptions;
	}

	@Override
	public JPanel getMainPanel() {
		return panelMain;
	}

	@Override
	public void load() {
		if (httpMessage == null) {
			return;
		}
		
		currentView.load();		
	}

	@Override
	public void save() {
		if (httpMessage == null) {
			return;
		}
		
		currentView.save();
	}

	@Override
	public void setHttpMessage(HttpMessage httpMessage) {
		this.httpMessage = httpMessage;

		modelText.setHttpMessage(httpMessage);

		
		this.textView.setHttpMessage(httpMessage);
	}
[...]
```

We use HttpPanelTextView to display our data. This is basically just an extended JTextArea.

HttpPanelTextView needs the following arguments:
  * a Model
  * a MessageType, either Header, Body, or Full (for Searching, Fuzzing etc)
  * boolean isEditable

The Model has to extend HttpPanelTextModelInterface:
```
public abstract class HttpPanelTextModelInterface {
	protected HttpMessage httpMessage;
	
	public void setHttpMessage(HttpMessage httpMessage) {
		this.httpMessage = httpMessage;
	}
	
	public HttpMessage getHttpMessage() {
		return httpMessage;
	}
	
	public abstract String getData();
	public abstract void setData(String data);
}
```

Here:

```
public class RequestAllModelText extends HttpPanelTextModelInterface {
	
	public RequestAllModelText(HttpMessage httpMessage) {
		setHttpMessage(httpMessage);
	}
	
	@Override
	public String getData() {
		// Make a copy of the header and body, append it and return
		return httpMessage.getRequestHeader().toString() + httpMessage.getRequestBody().toString();
	}

	@Override
	public void setData(String data) {
		// Split data into header and body, and set each on the httpmessage
		String[] parts = data.split("\r\n\r\n");
        
        try {
                httpMessage.setRequestHeader(parts[0]);
        } catch (HttpMalformedHeaderException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
        
        if (parts.length == 2) {
                httpMessage.setRequestBody(parts[1]);
        }
	}
}

```