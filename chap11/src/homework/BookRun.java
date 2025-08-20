package homework;

import java.util.Scanner;

public class BookRun {

	public static void main(String[] args) {
		Member member = new Member("홍길동", 30, "남자");
		LibraryController lc = new LibraryController(member);
		
		
		lc.insertBook();
		lc.info();
		
		System.out.print("검색할 책을 적으세요 >>> ");
		Scanner sc = new Scanner(System.in);
		
		String k1 = sc.next();
		
		lc.searchBook(k1);
	}
}
