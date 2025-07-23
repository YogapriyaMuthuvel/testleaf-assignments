package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElement {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(10);
		numbers.add(6);
		numbers.add(8);
		
		System.out.println("The added numbers are: " +numbers);
		
		//Arrange the collection in ascending order
		
		Collections.sort(numbers);
		System.out.println("Asecnding order:" +numbers);
		
		//Find and print missing number
		
		System.out.println("Missing numbers are: ");
	        for (int i = 0; i < numbers.size() - 1; i++) {
	            int current = numbers.get(i);
	            int next = numbers.get(i + 1);

	            if (next != current + 1) {
	                for (int missing = current + 1; missing < next; missing++) {
	                    System.out.println(missing);
	                }
			
	            }
	}

	}
}
