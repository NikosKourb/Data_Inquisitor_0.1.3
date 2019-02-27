package functions.transfigurers.string;

import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.io.Reader;
import java.io.StringReader;
//import java.net.URL;
import java.util.ArrayList;

public interface StringToStringArrayTransfigure {
	
	
	
	public default String[] StringToStringArray( String string ) {
		
		ArrayList< String > stringList = new ArrayList< String >();
		String line = "";
		int counter = 0;
		
		try {
			
			BufferedReader br = new BufferedReader( new  StringReader( string ) );
			
			while ( ( line = br.readLine() ) != null ) {
				
				stringList.add( counter , line );
				
				counter++;
				
			}

		}
		
		catch ( IOException e ) {
			
			e.printStackTrace();
			
		}
		
		String[] stringArray = stringList.toArray( new String[ stringList.size() ] );
		
		return stringArray;
		
	}
	
	
	
	
	
}
