package parameters.maps.locations;


public class AttributeLocation {
	
	private int lineCoordinates;
	private int characterStartCoordinates;
	private int characterEndLocation;
	
	
	public AttributeLocation() {}
	
	
	public AttributeLocation( int lineCoordinates , int characterStartCoordinates , int characterEndLocation ) {
		
		this.lineCoordinates = lineCoordinates;
		
		this.characterStartCoordinates = characterStartCoordinates;
		
		this.characterEndLocation = characterEndLocation;
		
	}
	
	
	
	public int getLineCoordinates() {
		
		return lineCoordinates;
	
	}
	
	
	
	public void setLineCoordinates( int lineCoordinates ) {
		
		this.lineCoordinates = lineCoordinates;
	
	}
	
	
	
	public int getCharacterStartCoordinates() {
		
		return characterStartCoordinates;
	
	}
	
	
	
	public void setCharacterStartCoordinates( int characterStartCoordinates ) {
		
		this.characterStartCoordinates = characterStartCoordinates;
	
	}
	
	
	
	public int getCharacterEndLocation() {
		
		return characterEndLocation;
	
	}
	
	
	
	public void setCharacterEndLocation( int characterEndLocation ) {
		
		this.characterEndLocation = characterEndLocation;
	
	}
	
	
	
	@Override
	public String toString() {
		
		return "AttributeLocation = [ Line= " + lineCoordinates + " , Char Start= " + characterStartCoordinates + " , Char End= " + characterEndLocation + " ]";
		
	}
	
	
	
	
	
}
