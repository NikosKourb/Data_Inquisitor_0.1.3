package parameters.html;


import functions.transfigurers.html.HTMLToStringTransfigure;



public class HTMLPageString extends HTMLPage implements HTMLToStringTransfigure {
	
	private String htmlString;
	
	
	public HTMLPageString() {}
	
	
	public HTMLPageString( String urlAddress ) {
		
		super( urlAddress );
		
		this.htmlString = HTMLToString( urlAddress );
		
	}
	
	
	
	public String getHtmlString() {
		
		return htmlString;
		
	}
	
	
	
	public void setHtmlString() {
		
		this.htmlString = HTMLToString( getUrlAddress() );
		
	}
	
	
	
	@Override
	public String toString() {
		
		return htmlString;
		
	}
	
	
	
	
}
