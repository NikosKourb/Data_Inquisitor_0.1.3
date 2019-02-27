package parameters.html;


public class HTMLPage {
	
	private String urlAddress;
	
	
	public HTMLPage() {}
	
	
	public HTMLPage( String urlAddress ) {
		
		this.urlAddress = urlAddress;
		
	}
	
	
	
	public String getUrlAddress() {
		
		return urlAddress;
		
	}
	
	
	
	public void setUrlAddress( String urlAddress ) {
		
		this.urlAddress = urlAddress;
		
	}
	
	
	
	@Override
	public String toString() {
		
		return "HTML [urlAddress= '" + urlAddress + "' ]";
		
	}
	
	
	
	
	
}
