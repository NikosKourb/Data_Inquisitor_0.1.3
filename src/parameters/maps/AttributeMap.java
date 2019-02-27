package parameters.maps;


import java.util.ArrayList;

import parameters.maps.locations.AttributeLocation;
import parameters.maps.locations.MarkerLocation;



public class AttributeMap {
	
	private ArrayList< MarkerLocation > markerLocationList = new ArrayList< MarkerLocation >();
	private AttributeLocation attributeLocation;
	
	
	public AttributeMap() {}
	
	
	public AttributeMap( ArrayList< MarkerLocation > markerLocationArray , AttributeLocation attributeLocation ) {
		
		this.markerLocationList = markerLocationArray;
		
		this.attributeLocation = attributeLocation;
		
	}
	
	
	
	public ArrayList< MarkerLocation > getMarkerLocationList() {
		
		return markerLocationList;
	
	}
	
	
	
	public void setMarkerLocationList( ArrayList< MarkerLocation > markerLocationArray ) {
		
		this.markerLocationList = markerLocationArray;
		
	}
	
	
	
	public AttributeLocation getAttributeLocation() {
		
		return attributeLocation;
		
	}
	
	
	
	public void setAttributeLocation( AttributeLocation attributeLocation ) {
		
		this.attributeLocation = attributeLocation;
		
	}
	
	
	
	@Override
	public String toString() {
		
		String markerLocationListString = "";
		
		for( int i = 0; i < markerLocationList.size(); i++ ) {
			
			markerLocationListString = markerLocationListString + markerLocationList.get( i ) + "\r";
			
		}
		
		return "AttributeMap = [ MarkerLocationList=" + "\n" + markerLocationListString + "AttributeLocation=" + attributeLocation + " ]";
		
	}
	
	
	
	
	
}
