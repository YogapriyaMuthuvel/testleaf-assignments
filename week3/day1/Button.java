package week3.day1;

public class Button extends WebElement {
	
	 public void submit() {
		System.out.println("Submitted the assignment successfully");

	}
	 

	public static void main(String[] args) {
		
		Button option1 = new Button();
		option1.click();
		option1.setText("hello");
		option1.submit();
		

	}

}
