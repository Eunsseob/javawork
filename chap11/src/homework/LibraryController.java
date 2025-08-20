package homework;

import java.util.ArrayList;

public class LibraryController {

	private Member member;
	private ArrayList<Book> aList;
	
	LibraryController(){}
	
	public LibraryController (Member member) {
		this.member = member;
		this.aList = new ArrayList<>();
	}
	
	public void info() {
		this.member.toString();
		System.out.println(this.member.toString());
	}
	
	void insertBook() {
		aList.add(new Book("어린왕자", "쌩떽쥐폐리", "남양"));
	    aList.add(new Book("백설공주", "그림형제", "한림출판사"));
	    aList.add(new Book("해리포터", "J.K. 롤링", "문학동네"));
	    
	    System.out.println(aList);
	    }
	
	void insertBook(Book book) {
		aList.add(book);
	}
	
	ArrayList<Book> selectAll(){
		return aList;
	}
	
	Book searchBook(String bookTitle) {
		Book book = null;
		for(Book b : aList) {
			if (b.getTitle().equals(bookTitle)) {
				book = b;
				System.out.println("찾으시는 책 : " + book + "있습니다!!");
				break;
			}
			System.out.println("다시 한번 적어보세요");
		}
		return book;
	}

}
