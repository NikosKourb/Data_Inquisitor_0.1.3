package parameters.maps;


import java.util.ArrayList;



public class GroupMap {
	
	private ArrayList< ObjectMap > objectMapList = new ArrayList< ObjectMap >();
	
	
	public GroupMap() {}
	
	
	public GroupMap( ArrayList< ObjectMap > objectMapList ) {
		
		this.objectMapList = objectMapList;
		
	}
	
	
	
	public ArrayList< ObjectMap > getObjectMapList() {
		
		return objectMapList;
		
	}
	
	
	
	public void setObjectMapList( ArrayList< ObjectMap > objectMapList ) {
		
		this.objectMapList = objectMapList;
		
	}
	
	
	
	@Override
	public String toString() {
		
		String objectMapListString = "";
		
		for( int i = 0; i < objectMapList.size(); i++ ) {
			
			objectMapListString = objectMapListString + objectMapList.get( i ) + "\r";
			
		}
		
		return "GroupMap = [ ObjectMapList=" + "\n" + objectMapListString + " ]" + "\n";
		
	}
	
	
	
	
	
}
