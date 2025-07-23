package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		List<Integer> number = new ArrayList<Integer>();
		number.add(3);
		number.add(2);
		number.add(11);
		number.add(4);
		number.add(6);
		number.add(7);
		
		System.out.println("The added numbers are: " +number);
		
		//Sort the numbers in ascending order
		
		Collections.sort(number);
		System.out.println("After sorting: " + number);
		
		//Find second largest number
		
		int secondLargest = number.get(number.size()-2);
		System.out.println("The Second Largestnumber is " +secondLargest);
		
	
		
		

	}

}
