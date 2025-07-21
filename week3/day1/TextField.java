package week3.day1;

public class TextField extends WebElement{

	public void getText() {
		System.out.println("The text retrived successfully");

	}
	public static void main(String[] args) {
		
		TextField option2 = new TextField();
		option2.click();
		option2.setText("hello");
		option2.getText();
		

	}

}
