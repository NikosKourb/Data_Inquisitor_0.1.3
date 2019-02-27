package functions.transfigurers.html;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;



public interface HTMLToStringTransfigure {
	
	
	
	public default String HTMLToString( String urlAddress ) {
		
		String htmlString = "";
		String currentLine = "";
		
		try {
			
			URL url = new URL( urlAddress );
			
			InputStream inputStreamURL = url.openStream();
			
			BufferedReader br = new BufferedReader( new InputStreamReader( inputStreamURL ) );
			
			while ( ( currentLine = br.readLine() ) != null ) {
				
				htmlString = htmlString + currentLine + "\r";
				
			}
			
		}
		
		catch ( IOException e ) {
			
			e.printStackTrace();
			
		}
		
		return htmlString;
		
	}
	
	
	
	
	
}
