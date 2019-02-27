package functions.transfigurers.string;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public interface StringToTextFileTransfigure {
	
	
	
	public default File StringToTextFile( String string , String filename ) {
		
		File file = new File( filename + ".txt" );
		
		try {
			
			BufferedWriter bw = new BufferedWriter( new FileWriter( file , false ) );
			
			bw.write( string );
			
			bw.close();
			
		}
		
		catch ( IOException e ) {
			
			e.printStackTrace();
			
		}
		
		return file;
		
	}
	
	
	
	
	
}
