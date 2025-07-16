package week2.day2;

public class ReverseString {

	public static void main(String[] args) {
		
	 String companyName= "TestLeaf";
	 char[] charArray = companyName.toCharArray();
	 System.out.println("Reversed string: ");
	 
	 for(int i=charArray.length-1; i >= 0; i--) {
		 System.out.println(charArray[i]);
	 }
	}

}
