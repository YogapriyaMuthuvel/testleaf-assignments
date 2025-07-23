package week3.day2;

public class JavaConnection implements DatabaseConnection{

  // Add unimplemented methods
	@Override
	public void connect() {
		System.out.println("Database connected successfully");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Database disconnected successfully");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Update executed and value stored in the database");
		
	}

	public static void main(String[] args) {
		
		// create object for java connection class
		JavaConnection data = new JavaConnection();
		data.connect();
		data.disconnect();
		data.executeUpdate();

	}
	
}
