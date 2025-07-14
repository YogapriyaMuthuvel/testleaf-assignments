package week2.day1;

public class LibraryManagement {

	public static void main(String[] args) {
		Library book = new Library();
		String books = book.addBook("The Great Gatsby");
		book.issueBook();

	}

}
