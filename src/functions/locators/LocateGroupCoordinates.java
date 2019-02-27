package functions.locators;


import parameters.identifiers.AttributeIdentifier;
import parameters.identifiers.MarkerIdentifier;
import parameters.identifiers.ObjectIdentifier;
import parameters.maps.AttributeMap;
import parameters.maps.GroupMap;
import parameters.maps.ObjectMap;
import parameters.maps.locations.MarkerLocation;



public interface LocateGroupCoordinates {

	public default GroupMap getGroupCoordinates( String[] htmlLineArray , ObjectIdentifier identifier ) {
		
		AttributeIdentifier[] attributetIdentifierArray = identifier.getAttributeIdentifierArray();
		GroupMap groupMap = new GroupMap();
		int currentLineIndex = 0;
		int objectCounter = 0;
		boolean attributeMarkerDistanceChecker = true;
		
		while( currentLineIndex < htmlLineArray.length) {
			
			ObjectMap objectMap = new ObjectMap();
			
			groupMap.getObjectMapList().add( objectCounter , objectMap );
			
			for( int i = 0; i < attributetIdentifierArray.length; i++ ) {
				
				AttributeMap attributeMap = new AttributeMap();
				
				objectMap.getAttributeMapList().add( i , attributeMap );
				
				AttributeIdentifier attributeIdentifier = attributetIdentifierArray[ i ];
				
				MarkerIdentifier[] markerIdentifierArray = attributeIdentifier.getMarkerArray();
				
				for( int j = 0; j < markerIdentifierArray.length; j++ ) {
					
					String markerSearchterm = markerIdentifierArray[ j ].getSearchTerm();
					
					boolean flag = true;
					
					while( flag == true && currentLineIndex < htmlLineArray.length ) {
						
						if ( j >= 1 ) {
							
							if ( markerIdentifierArray[ j ].getRelevantLinePositionIndex() == markerIdentifierArray[ j - 1 ].getRelevantLinePositionIndex() ) {
								
								currentLineIndex = attributeMap.getMarkerLocationList().get( j - 1 ).getLineCoordinate();
								
							}
							
							if ( ( markerIdentifierArray[ j ].getRelevantLinePositionIndex() - markerIdentifierArray[ j - 1 ].getRelevantLinePositionIndex() ) == ( currentLineIndex - attributeMap.getMarkerLocationList().get( j - 1 ).getLineCoordinate() ) ) {
								
								boolean innerFlag = true;
								
								attributeMarkerDistanceChecker = innerFlag;
								
							}
							
						}
						
						if ( htmlLineArray[ currentLineIndex ].contains( markerSearchterm ) && attributeMarkerDistanceChecker == true ) {
							
							System.out.println( htmlLineArray[ currentLineIndex ] );//////////
							
							int characterStartPositionCoordinate = 0;
							int characterEndPositionCoordinate = 0;
							
							if ( markerIdentifierArray[ j ].getRelevantLinePositionIndex() == 0 && markerIdentifierArray[ j ].getRelevantCharacterPositionIndex() > 0 ) {
								
								characterStartPositionCoordinate = ( htmlLineArray[ currentLineIndex ].indexOf( markerIdentifierArray[ j - 1 ].getSearchTerm() ) ) + markerIdentifierArray[ j - 1 ].getSearchTerm().length() + markerIdentifierArray[ j - 1 ].getRelevantCharacterPositionIndex() + 1;
								
								attributeMap.getMarkerLocationList().get( j - 1 ).setCharacterCoordinate( characterStartPositionCoordinate );
								
								characterEndPositionCoordinate = htmlLineArray[ currentLineIndex ].indexOf( markerSearchterm ) - markerIdentifierArray[ j ].getRelevantCharacterPositionIndex() + 1;
								
							}
							
							MarkerLocation markerLocation = new MarkerLocation( currentLineIndex , characterEndPositionCoordinate );
							
							attributeMap.getMarkerLocationList().add( j , markerLocation );
							
							flag = false;
							
						}
						
						currentLineIndex++;
						
					}
					
				}
				
			}
			
			objectCounter++;
			
		}
		
		groupMap.getObjectMapList().remove( objectCounter - 1 );
		
		return groupMap;
		
	}
	
	
	
	
	
}