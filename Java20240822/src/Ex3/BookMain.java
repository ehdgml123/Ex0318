package Ex3;

public class BookMain {

	public static void main(String[] args) {
		
		
		Book book = new Book();
		book.displayInfo();
		
		Book book1 = new Book("Hellow", "Java", 20);
		book1.displayInfo();
		
		Book book2 = new Book("Hellow", "Spring", 20);
		book2.displayInfo();

		Book book3 = new Book("He", "Spring", 50);
		book3.displayInfo();

		
		
	}

}
