package it.java.app.modello;

public class Support {

	private String url;
	private String text;
	
	
	public Support() {
		super();
	}

	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Support [url=" + url + ", text=" + text + "]";
	}
	
	
	
	
	
}
