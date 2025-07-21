package week3.day1;

public class LoginTestData extends TestData {
	
	public void enterUsername() {
		System.out.println("Enter username: Test");

	}
	
	public void enterPassword() {
		System.out.println("Enter password: Test123");

	}

	public static void main(String[] args) {
		
		LoginTestData data = new LoginTestData();
		data.enterCredentials();
		data.navigateToHomePage();
		data.enterUsername();
		data.enterPassword();
		
	}

}
