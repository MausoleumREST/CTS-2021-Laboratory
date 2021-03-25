package Registry;

public class SingletonRegistry {

	public static void main(String[] args) {
		RESTBackend backend1 = RESTBackend.getRESTBackend("10.0.0.1", "profile");
		RESTBackend backend2 = RESTBackend.getRESTBackend("10.0.0.1", "profile");
		
		if (backend1 == backend2) {
			System.out.println("These point to the same object");
		} else {
			System.out.println("These do not point to the same object");
		}
		
		RESTBackend backend3 = RESTBackend.getRESTBackend("192.168.10.10", "CevaSaNuFieProfile");
		if (backend1 == backend3) {
			System.out.println("These point to the same object");
	} else {
		System.out.println("These do not point to the same object");
	}
	}

}
