package parameters.identifiers;


import functions.locators.LocateGroupCoordinates;
import functions.locators.LocateObjects;



public class ObjectIdentifier implements LocateObjects , LocateGroupCoordinates {
	
	private AttributeIdentifier[] attributeIdentifierArray;
	
	
	public ObjectIdentifier() {}
	
	
	public ObjectIdentifier( AttributeIdentifier[] attributeIdentifierArray ) {
		
		this.attributeIdentifierArray = attributeIdentifierArray;
		
	}
	
	
	
	public AttributeIdentifier[] getAttributeIdentifierArray() {
		
		return attributeIdentifierArray;
		
	}
	
	
	
	public void setAttributeIdentifierArray( AttributeIdentifier[] attributeIdentifierArray ) {
		
		this.attributeIdentifierArray = attributeIdentifierArray;
		
	}
	
	
	
	@Override
	public String toString() {
		
		String attributeIdentifierArrayString = "";
		
		for( int i = 0; i < attributeIdentifierArray.length; i++ ) {
			
			attributeIdentifierArrayString = attributeIdentifierArrayString + ( attributeIdentifierArray[ i ].toString() + "\n" );
			
		}
		
		return "ObjectIdentifier= [" + "\n" + attributeIdentifierArrayString + "]";
		
	}
	
	
	
	
	
}