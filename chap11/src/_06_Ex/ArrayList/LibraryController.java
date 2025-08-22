package _06_Ex.ArrayList;

import java.util.ArrayList;
import java.util.TreeSet;

public class LibraryController {

	ArrayList<Book> List = new ArrayList<>();
	
	public LibraryController() {
		List.add(new Book("java","서민구","IT",5000));
		List.add(new Book("spring","강민구","전기전자",3000));
		List.add(new Book("html","이민구","화학공학",7000));
	}
	
	void insertBook(Book book) {
		List.add(book);
	}
	
	public ArrayList<Book> selectAll() {
		return List;
	}
	
	Book searchBook(String keyword) {   
		Book book = null;
		for(int i = 0; i<List.size(); i++) {
			if(keyword.equals(List.get(i).getTitle())) {
				book = List.get(i);
				break;
			}
		}
		if(book == null)
			System.out.println(keyword + "라는 책이 없습니다");
		return book;
	}
	
	Book deleteBook(String title, String author) {
		Book delbook = null;
		for(int j = 0; j<List.size(); j++) {
			Book currentBook = List.get(j);
			if(title.equals(currentBook.getTitle()) && author.equals(currentBook.getAuthor())) {
				delbook = currentBook;
	            List.remove(j); // 인덱스로 삭제하는 게 안전
	            break;
			}
		}
		if(delbook == null)
			System.out.println(title + "과 "+author + "의 책은 없습니다");
		return delbook;
		
	}
	
	int ascBook() {
		List.sort(null);
		return 1;
	 }
}
