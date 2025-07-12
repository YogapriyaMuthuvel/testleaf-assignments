package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int number =13;
		
		for (int first = 0, second =1; first <= number; ) {
			System.out.println(first + " ");
			int third = first + second;
			first = second;
			second =third;
		}

	}

}
