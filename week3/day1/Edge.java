package week3.day1;

public class Edge extends Browser{
	
	public void takeSnap() {
		System.out.println("The snapshot taken sucessfully");
	}
	
	public void clearCookies() {
		System.out.println("The Cookies cleared sucessfully");
	}
 public static void main(String[] args) {
	 
	 Edge option1 = new Edge();
	 option1.takeSnap();
	 option1.clearCookies();
	 option1.openURL();
	 option1.closeBrowser();
	 option1.navigateBack();
	
}
}
