package functions.locators;


import java.util.ArrayList;

import parameters.identifiers.AttributeIdentifier;
import parameters.identifiers.MarkerIdentifier;
import parameters.identifiers.ObjectIdentifier;
import parameters.maps.locations.Location;



public interface LocateObjects {
	
	public default ArrayList< ArrayList < ArrayList < Location > > > getObjectsLocations( String[] htmlLineArray , ObjectIdentifier identifier , int currentLineIndex ) {
		
		AttributeIdentifier[] objIdentifier = identifier.getAttributeIdentifierArray();
		ArrayList< ArrayList < ArrayList < Location > > > objectsLocationsList = new ArrayList< ArrayList < ArrayList < Location > > >();
		int objectCounter = 0;
		boolean attributeMarkerDistanceChecker = true;
		
		while( currentLineIndex < htmlLineArray.length) {
			
			ArrayList< ArrayList < Location > > attributesLocationsList = new ArrayList< ArrayList < Location > >();
			
			objectsLocationsList.add( objectCounter , attributesLocationsList);
			
			for( int i = 0; i < objIdentifier.length; i++ ) {
				
				ArrayList < Location > markerslocationsList = new ArrayList < Location >();
				
				attributesLocationsList.add( i , markerslocationsList );
				
				AttributeIdentifier markerArray = objIdentifier[ i ];
				
				MarkerIdentifier[] attrIdentifier = markerArray.getMarkerArray();
				
				for( int j = 0; j < attrIdentifier.length; j++ ) {
					
					String markerSearchterm = attrIdentifier[ j ].getSearchTerm();
					
					boolean flag = true;
					
					while( flag == true && currentLineIndex < htmlLineArray.length ) {
						
						if ( j >= 1 ) {
							
							if ( attrIdentifier[ j ].getRelevantLinePositionIndex() == attrIdentifier[ j - 1 ].getRelevantLinePositionIndex() ) {
								
								currentLineIndex = markerslocationsList.get( j - 1 ).getLineIndex();
								
							}
							
							if ( ( attrIdentifier[ j ].getRelevantLinePositionIndex() - attrIdentifier[ j - 1 ].getRelevantLinePositionIndex() ) == ( currentLineIndex - markerslocationsList.get( j - 1 ).getLineIndex() ) ) {
								
								boolean innerFlag = true;
								
								attributeMarkerDistanceChecker = innerFlag;
								
							}
							
						}
						
						if ( htmlLineArray[ currentLineIndex ].contains( markerSearchterm ) && attributeMarkerDistanceChecker == true ) {
							
							System.out.println( htmlLineArray[ currentLineIndex ] );//////////
							
							int characterStartPositionIndex = 0;
							int characterEndPositionIndex = 0;
							
							if ( attrIdentifier[ j ].getRelevantLinePositionIndex() == 0 && attrIdentifier[ j ].getRelevantCharacterPositionIndex() > 0 ) {
								
								characterStartPositionIndex = ( htmlLineArray[ currentLineIndex ].indexOf( attrIdentifier[ j - 1 ].getSearchTerm() ) ) + attrIdentifier[ j - 1 ].getSearchTerm().length() + attrIdentifier[ j - 1 ].getRelevantCharacterPositionIndex() + 1;
								
								markerslocationsList.get( j - 1 ).setCharacterIndex( characterStartPositionIndex );
								
								characterEndPositionIndex = htmlLineArray[ currentLineIndex ].indexOf( markerSearchterm ) - attrIdentifier[ j ].getRelevantCharacterPositionIndex() + 1;
								
							}
							
							Location markerLocation = new Location( currentLineIndex , characterEndPositionIndex );
							
							markerslocationsList.add( j , markerLocation );
							
							flag = false;
							
						}
						
						currentLineIndex++;
						
					}
					
				}
				
			}
			
			objectCounter++;
			
		}
		
		objectsLocationsList.remove( objectCounter - 1 );
		
		return objectsLocationsList;
		
	}
	
	
	
	
	
}