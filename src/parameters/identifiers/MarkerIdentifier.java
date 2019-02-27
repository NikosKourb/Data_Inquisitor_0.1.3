package parameters.identifiers;


public class MarkerIdentifier {
	
	private int relevantLinePositionIndex;
	private int relevantCharacterPositionIndex;
	private String searchTerm;
	
	
	public MarkerIdentifier() {}
	
	
	
	public MarkerIdentifier( int relevantLinePositionIndex , int relevantCharacterPositionIndex , String searchTerm ) {
		
		this.relevantLinePositionIndex = relevantLinePositionIndex;
		
		this.relevantCharacterPositionIndex = relevantCharacterPositionIndex;
		
		this.searchTerm = searchTerm;
		
	}
	
	
	
	public int getRelevantLinePositionIndex() {
		
		return relevantLinePositionIndex;
		
	}
	
	
	
	public void setRelevantLinePositionIndex( int relevantLinePositionIndex ) {
		
		this.relevantLinePositionIndex = relevantLinePositionIndex;
		
	}
	
	
	
	public int getRelevantCharacterPositionIndex() {
		
		return relevantCharacterPositionIndex;
		
	}
	
	
	
	public void setRelevantCharacterPositionIndex( int relevantCharacterPositionIndex ) {
		
		this.relevantCharacterPositionIndex = relevantCharacterPositionIndex;
		
	}
	
	
	
	public String getSearchTerm() {
		
		return searchTerm;
		
	}
	
	
	
	public void setSearchTerm( String searchTerm ) {
		
		this.searchTerm = searchTerm;
		
	}
	
	
	
	@Override
	public String toString() {
		
		return "Search Parameter= { " + relevantLinePositionIndex + " , " + relevantCharacterPositionIndex +  " , \'" + searchTerm + "\' }";
		
	}
	
	
	
	
	
}
