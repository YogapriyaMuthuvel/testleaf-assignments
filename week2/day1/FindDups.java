package week2.day1;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		int[] numbers={2, 5, 7, 7, 5, 9, 2, 3};
		Arrays.sort(numbers);
		System.out.println("Duplicate numbers are:");
		for(int i=0; i<numbers.length-1; i++) {
			if(numbers[i]==numbers[i+1]) {
				System.out.println(numbers[i]);
			}
		}
		

	}

}
