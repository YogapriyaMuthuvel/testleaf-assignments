package week3.day1;

public class CheckBoxButton extends Button{
	
	public void clickCheckButton() {
		System.out.println("The Check button clicked successfully");

	}
	

	public static void main(String[] args) {
		
		CheckBoxButton option3 = new CheckBoxButton();
		
		option3.submit();
		option3.clickCheckButton();

	}

}
