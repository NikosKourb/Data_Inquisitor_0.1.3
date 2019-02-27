package testers;


import java.util.ArrayList;
import java.util.Arrays;

//import java.util.ArrayList;
import functions.transfigurers.html.HTMLToStringTransfigure;
import parameters.html.HTMLPage;
//import parameters.html.HTMLString;
import parameters.html.HTMLPageStringLineArray;
//import parameters.html.HTMLTextFile;
import parameters.identifiers.AttributeIdentifier;
import parameters.identifiers.MarkerIdentifier;
import parameters.identifiers.ObjectIdentifier;
import parameters.maps.GroupMap;
import parameters.maps.locations.Location;



public class Test01 implements HTMLToStringTransfigure {
	
	
	
	public static void main(String[] args) {
		
		//HTML
		HTMLPage site00 = new HTMLPage( "https://www.vrisko.gr/efimeries-farmakeion/agia-barbara/" );
		String html = site00.toString();
		System.out.println( html + "\n" );
		
		
		//HTML String
		//HTMLString site01 = new HTMLString( "https://www.vrisko.gr/efimeries-farmakeion/agia-barbara/" );
		//String HTMLString01 = site01.getHtmlString();
		//System.out.println( HTMLString01 + "\n" );
		//String HTMLString02 = site01.toString();
		//System.out.println( HTMLString02 + "\n" );
		
		
		//HTML Text File
		//HTMLTextFile site03 = new HTMLTextFile( "https://www.vrisko.gr/efimeries-farmakeion/agia-barbara/" , "vrisko-00");
		//String htmlTextFileString = site03.getFileText();
		//System.out.println( htmlTextFileString + "\n" );
		
		
		//HTML String Line Array
		HTMLPageStringLineArray site02 = new HTMLPageStringLineArray( "https://www.vrisko.gr/efimeries-farmakeion/agia-barbara/" );
		String[] htmlLineArray = site02.getHtmlLineArray();
		//String HTMLStringLineArrayString = site02.toString();
		//System.out.println( HTMLStringLineArrayString + "\n" );
		
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		//Marker Identifiers
		MarkerIdentifier markerIdentifier001 = new MarkerIdentifier(  3 ,   0 , "</a>" );                        System.out.println( markerIdentifier001 );
		MarkerIdentifier markerIdentifier002 = new MarkerIdentifier(  0 ,   1 , "</a>" );                        System.out.println( markerIdentifier002 );
		MarkerIdentifier markerIdentifier003 = new MarkerIdentifier( -2 ,   0 , "</a>" );                        System.out.println( markerIdentifier003 );
		MarkerIdentifier markerIdentifier004 = new MarkerIdentifier( -5 ,   4 , "</a>" );                        System.out.println( markerIdentifier004 );
		MarkerIdentifier markerIdentifier005 = new MarkerIdentifier(  0 ,  -4 , "</a>" );                        System.out.println( markerIdentifier005 );
		MarkerIdentifier markerIdentifier006 = new MarkerIdentifier(  0 ,   3 , "</a>" );                        System.out.println( markerIdentifier006 );
		MarkerIdentifier markerIdentifier007 = new MarkerIdentifier(  0 ,   4 , "</a>" );                        System.out.println( markerIdentifier007 );
		MarkerIdentifier markerIdentifier008 = new MarkerIdentifier( -5 , -11 , "</a>" );                        System.out.println( markerIdentifier008 );
		MarkerIdentifier markerIdentifier009 = new MarkerIdentifier( -5 ,   9 , "</a>" );                        System.out.println( markerIdentifier009 );
		MarkerIdentifier markerIdentifier010 = new MarkerIdentifier( -5 ,  -3 , "</a>" );                        System.out.println( markerIdentifier010 + "\n" + "\n" );
		
		//Attribute Identifier ---> Marker Identifier Array[]
		MarkerIdentifier[] markerIdentifierArray001 = { markerIdentifier001 , markerIdentifier002 , markerIdentifier003 , markerIdentifier004 , markerIdentifier005 , markerIdentifier006 , markerIdentifier007 , markerIdentifier008 , markerIdentifier009 , markerIdentifier010 };  System.out.println( Arrays.toString( markerIdentifierArray001 ) + "\n" );
		AttributeIdentifier attributeIdentifier001 = new AttributeIdentifier( markerIdentifierArray001 );        System.out.println( Arrays.toString( attributeIdentifier001.getMarkerArray() ) + "\n" + "\n" );
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		//Marker Identifiers
		MarkerIdentifier markerIdentifier01 = new MarkerIdentifier(  0 ,   1 , "</a>" );                                                         System.out.println( markerIdentifier01 );
		MarkerIdentifier markerIdentifier02 = new MarkerIdentifier(  0 ,  -1 , "class=\"ResultName\">" );                                        System.out.println( markerIdentifier02 + "\n" );
		
		//Attribute Identifier 01 ---> Marker Identifier Array[]
		MarkerIdentifier[] markerIdentifierArray01 = new MarkerIdentifier[] { markerIdentifier01 , markerIdentifier02 };                         System.out.println( Arrays.toString( markerIdentifierArray01 ) + "\n" );
		AttributeIdentifier attributeIdentifier01 = new AttributeIdentifier( markerIdentifierArray01 );                                          System.out.println( attributeIdentifier01.toString() + "\n" + "\n" );
		
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		//Marker Identifiers
		MarkerIdentifier markerIdentifier03 = new MarkerIdentifier(  0 ,   1 , "</span>" );                                                      System.out.println( markerIdentifier03 );
		MarkerIdentifier markerIdentifier04 = new MarkerIdentifier(  0 ,  -1 , "<span>" );                                                       System.out.println( markerIdentifier04 );
		MarkerIdentifier markerIdentifier05 = new MarkerIdentifier( -1 ,   0 , "<div class=\"ResultAddr\">" );                                   System.out.println( markerIdentifier05 + "\n" );
		
		//Attribute Identifier 02 ---> Marker Identifier Array[]
		MarkerIdentifier[] markerIdentifierArray02 = new MarkerIdentifier[] { markerIdentifier03 , markerIdentifier04 , markerIdentifier05 };    System.out.println( Arrays.toString( markerIdentifierArray02 ) + "\n" );
		AttributeIdentifier attributeIdentifier02 = new AttributeIdentifier( markerIdentifierArray02 );                                          System.out.println( attributeIdentifier02.toString() + "\n" + "\n" );
		
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		//Marker Identifiers
		MarkerIdentifier markerIdentifier06 = new MarkerIdentifier(  0 ,   1 , "</span>" );                                                      System.out.println( markerIdentifier06 );
		MarkerIdentifier markerIdentifier07 = new MarkerIdentifier(  0 ,  -1 , "class=\"spPhone\">" );                                           System.out.println( markerIdentifier07 + "\n" );
		
		//Attribute Identifier 03 ---> Marker Identifier Array[]
		MarkerIdentifier[] markerIdentifierArray03 = new MarkerIdentifier[] { markerIdentifier06 , markerIdentifier07 };                         System.out.println( Arrays.toString( markerIdentifierArray03 ) + "\n" );
		AttributeIdentifier attributeIdentifier03 = new AttributeIdentifier( markerIdentifierArray03 );                                          System.out.println( attributeIdentifier03.toString() + "\n" + "\n" );

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		//Marker Identifiers
		MarkerIdentifier markerIdentifier08 = new MarkerIdentifier(  0 ,   1 , "</span>" );                                                      System.out.println( markerIdentifier08 );
		MarkerIdentifier markerIdentifier09 = new MarkerIdentifier(  0 ,  -1 , "<span>" );                                                       System.out.println( markerIdentifier09 );
		MarkerIdentifier markerIdentifier10 = new MarkerIdentifier( -1 ,   0 , "<div class=\"DutyDay\">" );                                      System.out.println( markerIdentifier10 + "\n" );
		
		//Attribute Identifier 04 ---> Marker Identifier Array[]
		MarkerIdentifier[] markerIdentifierArray04 = new MarkerIdentifier[] { markerIdentifier08 , markerIdentifier09 , markerIdentifier10 };    System.out.println( Arrays.toString( markerIdentifierArray04 ) + "\n" );
		AttributeIdentifier attributeIdentifier04 = new AttributeIdentifier( markerIdentifierArray04 );                                          System.out.println( attributeIdentifier04.toString() + "\n" + "\n" );
		
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		//Object Identifier ---> Attribute Identifier Array []
		AttributeIdentifier[] attributeIdentifierArray01 = { attributeIdentifier01 , attributeIdentifier02 , attributeIdentifier03 , attributeIdentifier04 };      System.out.println( Arrays.toString( attributeIdentifierArray01 ) + "\n" );
		ObjectIdentifier objectIdentifier01 = new ObjectIdentifier( attributeIdentifierArray01 );                                                                  System.out.println( objectIdentifier01.toString() + "\n" + "\n" );
		
		
		//Group Map ---> Object Map <List> ---> AttributeMap <List> (using Locate Group Coordinates Interface)
		GroupMap ObjectLocations00 = objectIdentifier01.getGroupCoordinates( htmlLineArray , objectIdentifier01 );
		System.out.println( ObjectLocations00 );
		

		
		//Locate Objects
		ArrayList< ArrayList < ArrayList < Location > > > ObjectLocations = objectIdentifier01.getObjectsLocations( htmlLineArray , objectIdentifier01 , 0 );
		System.out.println( ObjectLocations );
		
		
		

	}
	
	
	
	
	
}