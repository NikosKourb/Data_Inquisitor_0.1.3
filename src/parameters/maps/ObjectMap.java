package parameters.maps;


import java.util.ArrayList;



public class ObjectMap {
	
	private ArrayList< AttributeMap > attributeMapList = new ArrayList< AttributeMap >();
	
	
	public ObjectMap() {}
	
	
	public ObjectMap( ArrayList< AttributeMap > attributeMapList ) {
		
		this.attributeMapList = attributeMapList;
		
	}
	
	
	
	public ArrayList< AttributeMap > getAttributeMapList() {
		
		return attributeMapList;
		
	}
	
	
	
	public void setAttributeMapList( ArrayList< AttributeMap > attributeMapList ) {
		
		this.attributeMapList = attributeMapList;
		
	}
	
	
	
	@Override
	public String toString() {
		
		String attributeMapListString = "";
		
		for( int i = 0; i < attributeMapList.size(); i++ ) {
			
			attributeMapListString = attributeMapListString + attributeMapList.get( i ) + "\r";
			
		}
		
		return "ObjectMap = [ AttributeMapList=" + "\n" + attributeMapListString + "\n" + " ]" + "\n";
		
	}
	
	
}
