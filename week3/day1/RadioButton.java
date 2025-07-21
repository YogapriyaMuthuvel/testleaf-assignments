package week3.day1;

public class RadioButton extends Button{
	
	public void selectRadioButton() {
		System.out.println("The radiobutton selected successfully");

	}

	public static void main(String[] args) {
		
		RadioButton option4 = new RadioButton();
		
		option4.submit();
		option4.selectRadioButton();
		

	}

}
