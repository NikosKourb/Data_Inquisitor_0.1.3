package parameters.maps.locations;


public class MarkerLocation {

	private int lineCoordinate;
	private int characterCoordinate;
	
	
	public MarkerLocation() {}
	
	
	public MarkerLocation( int lineCoordinate , int characterCoordinate ) {
		
		this.lineCoordinate = lineCoordinate;
		
		this.characterCoordinate = characterCoordinate;
		
	}
	
	
	
	public int getLineCoordinate() {
		
		return lineCoordinate;
		
	}
	
	
	
	public void setLineCoordinate( int lineCoordinate ) {
		
		this.lineCoordinate = lineCoordinate;
		
	}
	
	
	
	public int getCharacterCoordinate() {
		
		return characterCoordinate;
	
	}
	
	
	
	public void setCharacterCoordinate( int characterCoordinate ) {
		
		this.characterCoordinate = characterCoordinate;
		
	}
	
	
	
	@Override
	public String toString() {
		
		return "MarkerLocation = [ Line= " + lineCoordinate + " , Char=" + characterCoordinate + " ]";
		
	}
	
	
	
	
	
}
