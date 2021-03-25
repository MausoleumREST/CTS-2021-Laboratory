package staticversion;

public class RESTBackend {
	
	String url;
	String data;

	public static final RESTBackend theBackend;
	
	
	//executed only once because of the JIT Compiler (*.*)
	static {
		System.out.println("Is executed when the class is loaded by the JVM");
		theBackend = new RESTBackend();
		theBackend.url = "acs.ase.ro/cts";
	}
	
	//simple block
	
	{
		System.out.println("Executed before any constructor call!");
	}
	
	private RESTBackend() {
		
	}
}
