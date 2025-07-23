package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		
		//declare array 1 & 2
		int array1[] = {3, 2, 11, 4, 6, 7};
		int array2[] = {1, 2, 8, 4, 9, 7};
		
		// declare list
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		//convert to list
		
		for(int i = 0; i < array1.length; i++) {
			list1.add(array1[i]);
		}
		
		for(int i = 0; i < array2.length; i++) {
			list2.add(array2[i]);
		}
		
		// print the intersection
		
		System.out.println("Common numbers are:");
        for (int i = 0; i < list1.size(); i++) {
            if (list2.contains(list1.get(i))) {
                System.out.println(list1.get(i));
            }
        }
		
		
		
	}

}
