package week3.day3;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		
		String companyName = "google";
		char[] C = companyName.toCharArray();
		System.out.println(C);
	Set<Character> uniqueCharacter = new LinkedHashSet<Character>();
    for(int i = 0; i < C.length; i++) {
    	uniqueCharacter.add(C[i]);
	}
  System.out.println("The set is:" +uniqueCharacter);
}
}
