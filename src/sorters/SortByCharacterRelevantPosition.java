package sorters;


import java.util.Comparator;

import parameters.identifiers.MarkerIdentifier;



public class SortByCharacterRelevantPosition implements Comparator< MarkerIdentifier > {
	
	
	public SortByCharacterRelevantPosition() {}
	
	
	
	@Override
	public int compare( MarkerIdentifier marker1 , MarkerIdentifier marker2 ) {
		
		return marker1.getRelevantCharacterPositionIndex() - marker2.getRelevantCharacterPositionIndex() ;
		
	}
	
	
	
	
	
}
