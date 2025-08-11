package _07_Book;

public class BookRun {

	public static void main(String[] args) {
		Book book = new Book();

		book.infobook();
		
		book = new Book("홍길동");
		book.infobook();
		
		book = new Book("가영이", "KSUVN644");
		book.infobook();
		
		book = new Book("낄동이", "VJSOISN", 30000);
		book.infobook();
	}

}
