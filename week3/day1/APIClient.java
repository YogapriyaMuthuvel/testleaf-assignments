package week3.day1;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println("EndPoint of the APIClient:" + " " +endpoint );

	}
	
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("EndPoint of the APIClient:" + " " +endpoint);
		System.out.println("Request body:"  + requestBody);
		System.out.println("Request status:"  + requestStatus);

	}

	public static void main(String[] args) {
		
		APIClient client = new APIClient();
		client.sendRequest("/api/users");
		client.sendRequest("/api/users", "John", true);

	}

}
