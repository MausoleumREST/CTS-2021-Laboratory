
public class RESTBackend {

	String url;
	String data;
	
	private static RESTBackend theBackend = null;
	
	//eager-instantiation (^_^)
	//private static RESTBackend theBackend = new RESTBackend();
	private RESTBackend(String url, String data) {
		System.out.println("Opening a connection to the backend servcie");
		
	}
	
	public void sendGET() {
		System.out.println("Send GET command to " + this.url);
	}
	//lazy-instantiation example (-.-)
	public static synchronized RESTBackend getRESTBackend() {
		if(theBackend == null) {
			String url = "www.acs.ase.ro/game";
			String data = "get backend connection";
			theBackend = new RESTBackend(url, data);
		}
		return theBackend;
	}
	
}
