package sorters;


import java.util.Comparator;

import parameters.identifiers.MarkerIdentifier;



public class SortByLineAndCharacterRelevantPosition implements Comparator< MarkerIdentifier > {
	
	
	public SortByLineAndCharacterRelevantPosition() {}
	
	
	
	@Override
	public int compare( MarkerIdentifier marker1 , MarkerIdentifier marker2 ) {
		
		int comparisonResult;
		
		Integer markerLine1 = marker1.getRelevantLinePositionIndex();
		Integer markerLine2 = marker2.getRelevantLinePositionIndex();
		Integer markerCharacter1 = marker1.getRelevantCharacterPositionIndex();
		Integer markerCharacter2 = marker2.getRelevantCharacterPositionIndex();
		
		if( markerLine1 - markerLine2 !=0 ) {
			
			comparisonResult =  markerLine1 - ( markerLine2 );
			
		}
		
		else {
			
			comparisonResult = markerCharacter1 - ( markerCharacter2 );
			
		}
		
		return comparisonResult;
		
	}
	
	
	
	
	
}
