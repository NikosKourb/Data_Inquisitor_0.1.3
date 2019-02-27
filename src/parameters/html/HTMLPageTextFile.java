package parameters.html;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import functions.transfigurers.html.HTMLToTextFileTransfigure;



public class HTMLPageTextFile extends HTMLPage implements HTMLToTextFileTransfigure {
	
	private File htmlFile;
	private String fileName;
	
	public HTMLPageTextFile() {}
	
	
	public HTMLPageTextFile( String urlAddress , String fileName ) {
		
		super( urlAddress );
		
		this.htmlFile = HTMLToTextFile( urlAddress , fileName );
		
	}
	
	
	
	public String getFileName() {
		
		return fileName;
		
	}
	
	
	
	public void setFileName( String fileName ) {
		
		this.fileName = fileName;
		
	}
	
	
	
	public File getHtmlFile() {
		
		return htmlFile;
		
	}
	
	
	
	public void setHtmlFile() {
		
		this.htmlFile = HTMLToTextFile( getUrlAddress() , getFileName() );
		
	}
	
	
	
	public String getFileText() {
		
		String fileText = "";
		String line;
		
		try {
			
			BufferedReader bufferedReader = new BufferedReader( new FileReader( htmlFile ) );
			
			while ( ( line = bufferedReader.readLine() ) != null ) {
				
				fileText = fileText + line + "\r";
				
			}
			
			bufferedReader.close();
			
		} 
		
		catch ( IOException e ) {
			
			e.printStackTrace();
			
		}
		
		return fileText;
		
	}
	
	
	
	@Override
	public String toString() {
		
		return "HTMLTextFile [htmlFile=" + htmlFile + ", fileName=" + fileName + "]" + "\n" + "\n" + getFileText();
		
	}
	
	
	
	
	
}
