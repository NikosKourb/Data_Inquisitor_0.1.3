package functions.transfigurers.html;


import java.io.File;

import functions.transfigurers.string.StringToTextFileTransfigure;



public interface HTMLToTextFileTransfigure extends HTMLToStringTransfigure , StringToTextFileTransfigure {
	
	
	
	public default File HTMLToTextFile( String urlAddress , String filename ) {
		
		String htmlString = HTMLToString( urlAddress );
		
		File htmlTextFile = StringToTextFile( htmlString , filename );
		
		return htmlTextFile;
		
	}
	
	
	
	
	
}
