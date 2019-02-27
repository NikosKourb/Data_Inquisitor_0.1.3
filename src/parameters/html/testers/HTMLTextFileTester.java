package parameters.html.testers;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import parameters.html.HTMLPageTextFile;



public class HTMLTextFileTester {
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String userInput = "";

		String menuPart1 = "----------------------[HTMLTextFileTester]----------------------" + "\n";

		String menuPart2 = "1.Test 1st Way (by setting the URL address from the constructor)" + "\n"
				         + "2.Test 2nd Way (by getting the HTMLTextFile directly via the interface)" + "\n"
				         + "3.Test 3nd Way (by setting the URL address & the file's name)" + "\n"
				         + "4.Exit HTMLStringLineArrayTester" + "\n";

		String menuPart3 = "Please choose one of the above:" + "\n";

		while ( !userInput.equalsIgnoreCase( "n" ) && !userInput.equals( "4" ) ) {
			
			System.out.println( menuPart1 + menuPart2 + menuPart3 );

			userInput = sc.next();

			while ( !userInput.equals( "1" ) && !userInput.equals( "2" ) && !userInput.equals( "3" ) && !userInput.equals( "4" ) ) {

				System.out.println( "\n" + "Invalid Input !!!" + "\n" + "Please choose one of the following" + "\n" + menuPart2 );

				userInput = sc.next();

			}

			switch ( userInput ) {
			
			// 1st Way (by setting the URL address from the constructor)
			case( "1" ):
				
				HTMLPageTextFile htmlTextFile = new HTMLPageTextFile( "https://www.vrisko.gr/efimeries-farmakeion/agia-barbara/" , "vrisko-01" );
			
			    File  newhtmlTextFile = htmlTextFile.getHtmlFile();
			    
			    try {
			    	
			    	String currentLine = "";
			    	
			    	BufferedReader br = new BufferedReader(new FileReader ( newhtmlTextFile ) );
			    	
			    	System.out.println( "----------------1st Way (by setting the URL address from the constructor)-----------------" );
			    	
			    	while( ( currentLine = br.readLine() ) != null ) {
			    		
			    		System.out.println( currentLine );
			    		
			    	}
			    	
			    	System.out.println( "-------------------------------------END OF FIRST WAY-------------------------------------" );
			    	
			    	br.close();
			    	
			    } 
			    
			    catch ( IOException e ) {
			    	
			    	e.printStackTrace();
			    	
			    }
			    
			    System.out.println( "File's Name: " + newhtmlTextFile + "\n" );
			    
			    break;
			    
			// 2nd Way (by getting the HTMLTextFile directly via the interface)
			case( "2" ):
				
				HTMLPageTextFile htmlTextFile2 = new HTMLPageTextFile();
			
			    File  newhtmlTextFile2 = htmlTextFile2.HTMLToTextFile( "https://www.vrisko.gr/efimeries-farmakeion/agia-barbara/" , "vrisko-02" );
			    
			    try {
			    	
			    	String currentLine = "";
			    	
			    	BufferedReader br = new BufferedReader(new FileReader ( newhtmlTextFile2 ) );
			    	
			    	System.out.println( "----------------2nd Way (by getting the HTMLTextFile directly via the interface)-----------------" );
			    	
			    	while( ( currentLine = br.readLine() ) != null ) {
			    		
			    		System.out.println( currentLine );
			    		
			    	}
			    	
			    	System.out.println( "----------------------------------------END OF SECOND WAY----------------------------------------" );
			    	
			    	br.close();
			    	
			    } 
			    
			    catch ( IOException e ) {
			    	
			    	e.printStackTrace();
			    	
			    }
			    
			    System.out.println( "File's Name: " + newhtmlTextFile2 + "\n" );
			    
			    break;
			    
			// 3rd Way (by setting the URL address & the file's name)
			case("3"):
				
				HTMLPageTextFile htmlTextFile3 = new HTMLPageTextFile();
			
			    htmlTextFile3.setUrlAddress( "https://www.vrisko.gr/efimeries-farmakeion/agia-barbara/" );
			    
			    htmlTextFile3.setFileName( "vrisko-03" );
			    
			    htmlTextFile3.setHtmlFile();
			    
			    File  newhtmlTextFile3 = htmlTextFile3.getHtmlFile();
			    
			    try {
			    	
			    	String currentLine = "";
			    	
			    	BufferedReader br = new BufferedReader(new FileReader ( newhtmlTextFile3 ) );
			    	
			    	System.out.println( "----------------3rd Way (by setting the URL address & the file's name)-----------------" );
			    	
			    	while( ( currentLine = br.readLine() ) != null ) {
			    		
			    		System.out.println( currentLine );
			    		
			    	}
			    	
			    	System.out.println( "-----------------------------------END OF THIRD WAY-----------------------------------" );
			    	
			    	br.close();
			    	
			    } 
			    
			    catch ( IOException e ) {
			    	
			    	e.printStackTrace();
			    	
			    }
			    
			    System.out.println( "File's Name: " + newhtmlTextFile3 + "\n" );
			    
			    break;
			    
			}
			
			if ( !userInput.equals( "4" ) ) {
				
				System.out.println( "Do you want to continue (y/n):" + "\n" );
				
				userInput = sc.next();
				
				while ( !userInput.equalsIgnoreCase( "y" ) && !userInput.equalsIgnoreCase( "n" ) ) {
					
					System.out.println( "\n" + "Invalid Input !!!" + "\n" + "Do you want to continue (y/n):" + "\n" );
					
					userInput = sc.next();
					
				}
				
				System.out.println();
				
			}
			
		}
		
		sc.close();
		
	}
	
	
	
	
	
}