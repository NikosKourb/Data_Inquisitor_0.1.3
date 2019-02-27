package parameters.html.testers;


import java.util.Scanner;
import parameters.html.HTMLPageString;



public class HTMLStringTester {
	
	
	
	public static void main( String[] args ) {
		
		Scanner sc = new Scanner(System.in);

		String userInput = "";

		String menuPart1 = "-------------------------[HTMLStringTester]--------------------------" + "\n";

		String menuPart2 = "1.Test 1st Way (by setting the URL address from the constructor)" + "\n"
				         + "2.Test 2nd Way (by getting the HTMLString directly via the interface)" + "\n"
				         + "3.Test 3rd Way (by setting the URL address & the HtmlString)" + "\n"
				         + "4.Exit HTMLStringLTester" + "\n";

		String menuPart3 = "Please choose one of the above:" + "\n";

		while ( !userInput.equalsIgnoreCase( "n" ) && !userInput.equals( "4" ) ) {
			
			System.out.println( menuPart1 + menuPart2 + menuPart3 );

			userInput = sc.next();

			while ( !userInput.equals( "1" ) && !userInput.equals( "2" ) && !userInput.equals( "3" ) && !userInput.equals( "4" ) ) {

				System.out.println( "\n" + "Invalid Input !!!" + "\n" + "Please choose one of the following" + "\n" + menuPart2 );

				userInput = sc.next();

			}

			switch ( userInput ) {
			
			//1st Way (by setting the URL address from the constructor)
			case ("1"):
				
				HTMLPageString htmlString = new HTMLPageString( "https://www.vrisko.gr/efimeries-farmakeion/agia-barbara/" );
			
				String newHTMLString = htmlString.HTMLToString( htmlString.getUrlAddress() );
				
				System.out.println( "-------------1st Way (by setting the URL address from the constructor)-------------" + "\n" +
						            newHTMLString + "\n"
						          + "---------------------------------END OF FIRST WAY----------------------------------");
				
				break;
				
			//2nd Way (by getting the HTMLString directly via the interface)
			case ( "2" ):
				
				HTMLPageString htmlString2 = new HTMLPageString( "https://www.vrisko.gr/efimeries-farmakeion/agia-barbara/" );
			
			    String newHTMLString2 = htmlString2.HTMLToString( htmlString2.getUrlAddress() );
			    
			    System.out.println( "-------------1st Way (by setting the URL address from the constructor)--------------" + "\n" +
		                            newHTMLString2 + "\n" + 
				                    "---------------------------------END OF SECOND WAY----------------------------------" );
			    
			    break;
		
			//3rd Way (by setting the URL address & the HtmlString)
			case ( "3" ):
				
				HTMLPageString htmlString3 = new HTMLPageString();
			
			    htmlString3.setUrlAddress( "https://www.vrisko.gr/efimeries-farmakeion/agia-barbara/" );
			    
			    htmlString3.setHtmlString();
			    
			    String newHTMLString3 = htmlString3.getHtmlString();
			    
			    System.out.println( "---------------2nd Way (by setting the URL address & the HtmlString)---------------" + "\n" +
		                            newHTMLString3 + "\n" + 
				                    "---------------------------------END OF THIRD WAY----------------------------------" );
			    
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
