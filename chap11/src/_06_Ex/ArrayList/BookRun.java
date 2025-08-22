package _06_Ex.ArrayList;

import java.util.Scanner;
import java.util.TreeSet;

public class BookRun {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LibraryController lc = new LibraryController();
		
		
	    
		System.out.println("*************** 메뉴 *************");
		
		while(true) {
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 전체 도서 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 오름차순 정렬");
			System.out.println("0. 종료");
			
			int k1 = sc.nextInt();
			
			switch (k1) {
				case 1: {
					System.out.println("=============================");
					System.out.println("1. 새 도서 추가입니다.");
					System.out.println("제목을 적으세요");
					String title = sc.next();
					System.out.println("저자를 적으세요");
					String name = sc.next();
					System.out.println("카테고리를 적으세요");
					String bookname = sc.next();
					System.out.println("비용을 적으세요");
					int cost = sc.nextInt();
					
					lc.insertBook(new Book(title, name, bookname, cost));
					
					System.out.println("책 추가 완료!!!");
					System.out.println("=============================");
					break;
				}
				case 2: {
					System.out.println("=============================");
					System.out.println("2. 전체 도서 조회입니다.");
					System.out.println(lc.selectAll());
					break;
				}
				case 3: {
					System.out.println("3. 도서 검색입니다.");
					System.out.println("찾고자 하는 책의 이름을 적어주세요");
					String key = sc.next();
					System.out.println(lc.searchBook(key));
					break;
				}
				case 4: {
					System.out.println("4. 도서 삭제입니다.");
					System.out.println("삭제하고 싶은 책의 제목과 작가를 적으세요");
					String bookname = sc.next();
					String auth1 = sc.next();
					System.out.println(lc.deleteBook(bookname, auth1));
					break;
				}
				case 5: {
					System.out.println("5. 도서 가격 오름차순 정렬입니다.");
					lc.ascBook();
					System.out.println(lc.selectAll());
					break;
				}
				case 0: {
					System.out.println("0. 종료합니다");
					sc.close();
					return;
				}
				default:
					System.out.println("다시 입력하세요");
				}
		}
	}
}
