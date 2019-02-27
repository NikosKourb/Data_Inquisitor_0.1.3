package parameters.html.testers;


import java.util.Scanner;
import parameters.html.HTMLPageStringLineArray;



public class HTMLStringLineArrayTester {
	
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String userInput = "";

		String menuPart1 = "-------------------------[HTMLStringLineArrayTester]--------------------------" + "\n";

		String menuPart2 = "1.Test 1st Way (by setting the URL address from the constructor)" + "\n"
				         + "2.Test 2nd Way (by getting the HTMLStringLineArray directly via the interface)" + "\n"
				         + "3.Test 3nd Way (by setting the URL address & the HtmlLineArray)" + "\n"
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
			case ( "1" ):

				HTMLPageStringLineArray htmlStringLineArray = new HTMLPageStringLineArray( "https://www.vrisko.gr/efimeries-farmakeion/agia-barbara/" );

				String[] newHTMLStringLineArray = htmlStringLineArray.getHtmlLineArray();

				System.out.println( "----------------1st Way (by setting the URL address from the constructor)-----------------" );

				for ( int i = 0; i < newHTMLStringLineArray.length; i++ ) {

					System.out.println( newHTMLStringLineArray[ i ] );

				}

				System.out.println( "-------------------------------------END OF FIRST WAY-------------------------------------" );

				break;

			// 2nd Way (by getting the HTMLStringLineArray directly via the interface)
			case ("2"):

				HTMLPageStringLineArray htmlStringLineArray2 = new HTMLPageStringLineArray();

				String[] newHTMLStringLineArray2 = htmlStringLineArray2.HTMLToStringLineArray( "https://www.vrisko.gr/efimeries-farmakeion/agia-barbara/" );

				System.out.println( "--------------2nd Way (by getting the HTMLStringLineArray directly via the interface)--------------" );

				for ( int i = 0; i < newHTMLStringLineArray2.length; i++ ) {

					System.out.println( newHTMLStringLineArray2[ i ] );

				}

				System.out.println( "-----------------------------------------END OF SECOND WAY-----------------------------------------" );

				break;

			// 3nd Way (by setting the URL address & the HtmlLineArray)
			case ("3"):

				HTMLPageStringLineArray htmlStringLineArray3 = new HTMLPageStringLineArray();

				htmlStringLineArray3.setUrlAddress( "https://www.vrisko.gr/efimeries-farmakeion/agia-barbara/" );

				htmlStringLineArray3.setHtmlLineArray();

				String[] newHTMLStringLineArray3 = htmlStringLineArray3.getHtmlLineArray();

				System.out.println( "--------------3rd Way (by setting the URL address & the HtmlStringLineArray)--------------" );

				for ( int i = 0; i < newHTMLStringLineArray3.length; i++ ) {

					System.out.println( newHTMLStringLineArray3[ i ] );

				}

				System.out.println( "-------------------------------------END OF THIRD WAY-------------------------------------" );

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
