package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {

		List<String> sortList = new ArrayList<String>();
		// add the values
		sortList.add("HCL");
		sortList.add("Wipro");
		sortList.add("Aspire Systems");
		sortList.add("CTS");

		System.out.println("The added values are: " + sortList);

		// Arrange in ascending order

		Collections.sort(sortList);
		System.out.println("The list after sorted are:" + sortList);

		// Iterate the values in the list
		String result = "";  // result in string 
		for (int i = sortList.size() - 1; i >= 0; i--) {
			result += sortList.get(i);
			if (i != 0) {
				result += ", ";
			}

		}

		System.out.println("Reversed List: " + result);

	}

}
