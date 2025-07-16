package week2.day2;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		 String test = "changeme";
		 char[] charArray = test.toCharArray();
		 for(int i = charArray.length-1;i>=0; i--) {
			 if(i % 2 != 0){
				charArray[i] = Character.toUpperCase(charArray[i]); 
			 }

		 }
		 for (int i = 0; i < charArray.length; i++) {
			    System.out.print(charArray[i]);
		 }
	}

}
