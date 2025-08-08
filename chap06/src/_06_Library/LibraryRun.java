package _06_Library;

import java.util.Scanner;

public class LibraryRun {

	public static void main(String[] a) {
		LibraryApi lib = new LibraryApi();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("책의 제목을 입력하세요 >> ");
		
		String book = sc.next();
		
		System.out.println(lib.insertName(book));
		
		System.out.print("책의 저자를 입력하세요 >> ");
		
		String art1 = sc.next();
		
		System.out.println(lib.insertArtist(art1));
		
		System.out.print("책의 가격을 입력하세요 >> ");
		
		int cost1 = sc.nextInt();
		
		System.out.println(lib.insertCost(cost1));
		
		System.out.println("책의 정보입니다. >> ");
		
		System.out.println(lib.insertInform(book, art1, cost1));
		
	}
}
