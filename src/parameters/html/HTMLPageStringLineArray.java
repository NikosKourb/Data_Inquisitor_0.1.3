package parameters.html;


import functions.transfigurers.html.HTMLToStringLineArrayTransfigure;



public class HTMLPageStringLineArray extends HTMLPage implements HTMLToStringLineArrayTransfigure {
	
	private String[] htmlLineArray;
	
	
	public HTMLPageStringLineArray() {}
	
	
	public HTMLPageStringLineArray( String urlAddress ) {
		
		super( urlAddress );
		
		this.htmlLineArray = HTMLToStringLineArray( urlAddress );
		
	}
	
	
	public HTMLPageStringLineArray( String urlAddress , String[] htmlLineArray ) {

		super( urlAddress );

		this.htmlLineArray = htmlLineArray;

	}
	
	
	
	public String[] getHtmlLineArray() {
		
		return htmlLineArray;
		
	}
	
	
	
	public void setHtmlLineArray() {
		
		this.htmlLineArray = HTMLToStringLineArray( getUrlAddress() );
		
	}
	
	
	
	@Override
	public String toString() {
		
		String htmlString = "";
		
		for( int i = 0; i < htmlLineArray.length; i++ ) {
			
			htmlString = htmlString + htmlLineArray[ i ] + "\r";
			
		}
		
		return "HTMLStringLineArray = [ " + "\n" + htmlString + "\n" + " ]";
		
	}
	
	
	
	
	
}
