package week3.day1;

public class SubClass extends SuperClass {
	
	public void takeSnap() {
		System.out.println("Take snap from SubClass");
	}

	public static void main(String[] args) {
		SubClass option1 = new SubClass();
		option1.takeSnap();
		option1.reportStep("Login Test", "PASS");

	}

}
