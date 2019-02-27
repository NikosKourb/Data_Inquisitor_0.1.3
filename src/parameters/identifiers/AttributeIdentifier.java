package parameters.identifiers;


import java.util.ArrayList;
import java.util.Arrays;

import sorters.SortByLineAndCharacterRelevantPosition;



public class AttributeIdentifier {
	
	
	private MarkerIdentifier[] markerArray;
	
	
	public AttributeIdentifier() {};
	
	
	public AttributeIdentifier( MarkerIdentifier[] markerArray ) {
		
		Arrays.sort( markerArray , new SortByLineAndCharacterRelevantPosition() );
			
		this.markerArray = markerArray;
		
	}
	
	
	public AttributeIdentifier( ArrayList< MarkerIdentifier > markerList ) {
		
		MarkerIdentifier[] newMarkerArray = markerList.toArray( new MarkerIdentifier[ markerList.size() ] );
		
		Arrays.sort( markerArray , new SortByLineAndCharacterRelevantPosition() );
		
		this.markerArray = newMarkerArray;
		
	}
	
	
	
	public MarkerIdentifier[] getMarkerArray() {
		
		return markerArray;
		
	}
	
	
	
	public void setMarkerArray( MarkerIdentifier[] markerArray ) {
		
		this.markerArray = markerArray;
		
	}
	
	
	
	public MarkerIdentifier[] getSameLineMarkers() {
		
		ArrayList< MarkerIdentifier > sameLineMarkerList = new ArrayList< MarkerIdentifier >();
		MarkerIdentifier[] markerArray = getMarkerArray();
		int counter = 0;
		
		for ( int i = 0; i < markerArray.length; i++ ) {
			
			int relevantLinePosition = markerArray[ i ].getRelevantLinePositionIndex();
			
			if ( relevantLinePosition == 0 ) {
				
				sameLineMarkerList.add( counter , markerArray[ i ] );
				
				counter++;
				
			}
			
		}
		
		MarkerIdentifier[] sameLineMarkerArray = sameLineMarkerList.toArray( new MarkerIdentifier[ sameLineMarkerList.size() ] );
		
		return sameLineMarkerArray;
		
	}
	
	
	
	@Override
	public String toString() {
		
		String markerIdentifierArrayString = "";
		
		for( int i = 0; i < markerArray.length; i++ ) {
			
			markerIdentifierArrayString = markerIdentifierArrayString + ( markerArray[ i ].toString() + "\n" );
			
		}
		
		return "AttributeIdentifier= [" + "\n" + markerIdentifierArrayString + "]";
		
	}
	
	
	
	
	
}
