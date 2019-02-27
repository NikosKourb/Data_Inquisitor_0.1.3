package parameters.maps.locations;


import functions.locators.LocateObjects;



public class Location implements LocateObjects {
	
	private int lineIndex;
	private int characterIndex;
	
	
	public Location() {}
	
	
	public Location( int lineIndex , int characterIndex ) {
		
		this.lineIndex = lineIndex;
		
		this.characterIndex = characterIndex;
		
	}
	
	
	
	public int getLineIndex() {
		
		return lineIndex;
		
	}
	
	
	
	public void setLineIndex( int lineIndex ) {
		
		this.lineIndex = lineIndex;
		
	}
	
	
	
	public int getCharacterIndex() {
		
		return characterIndex;
		
	}
	
	
	
	public void setCharacterIndex( int characterIndex ) {
		
		this.characterIndex = characterIndex;
		
	}
	
	
	
	@Override
	public String toString() {
		
		return "Location = [ Line Index= " + lineIndex + " , Character Index= " + characterIndex + " ]";
		
	}
	
	
	
	
	
}
