package sorters;


import java.util.Comparator;

import parameters.identifiers.MarkerIdentifier;



public class SortByLineRelevantPosition implements Comparator< MarkerIdentifier > {
	
	
	public SortByLineRelevantPosition() {}
	
	
	
	@Override
	public int compare( MarkerIdentifier marker1 , MarkerIdentifier marker2 ) {
		
		return marker1.getRelevantLinePositionIndex() - marker2.getRelevantLinePositionIndex();
		
	}
	
	
	
	
	
}
