package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int input = 565;
		int output = 0;
		for (int temp = input; temp !=0; temp=temp/10) {
			int digit = temp%10;
		    output = output *10 + digit;
					}
		if(input ==output) {
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}

	}

}
