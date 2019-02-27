package functions.transfigurers.html;


import functions.transfigurers.string.StringToStringArrayTransfigure;



public interface HTMLToStringLineArrayTransfigure extends HTMLToStringTransfigure , StringToStringArrayTransfigure {
	
	
	
	public default String[] HTMLToStringLineArray( String urlAddress ) {
		
		String string = HTMLToString( urlAddress );
		
		String[] stringArray = StringToStringArray( string );
		
		return stringArray;
		
	}
	
	
	
	
	
}
