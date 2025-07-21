package week3.day1;

public class Overloading {
	
	public void reportStep(String message, String status) {
		System.out.println(message + ", " + status);

	}
	
public void reportStep(String message, String status, boolean snap ) {
	System.out.println(message + ", " + status + ", " + snap);

	}

public static void main(String[] args) {
	Overloading option = new Overloading();
	option.reportStep("Page loaded", "PASS");
	option.reportStep("Page failed to load", "FAIL", true);
	
	
}


}
