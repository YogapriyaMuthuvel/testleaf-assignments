package week2.day2;

public class FindOccurance {

	public static void main(String[] args) {
		String input = "TestLeaf";
		
		char[] charArray = input.toCharArray();
		
		int count = 0;
		
		for(int i = 0; i < charArray.length-1; i++ )
		{
			if(charArray[i] == 'e'){
				count++;
				}
			}
		System.out.println("The character 'e' occurred " + count + " times");
	}

}
