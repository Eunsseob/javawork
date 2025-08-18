package _02_StringMethod;

import java.util.Scanner;

public class T11_toLowerCase_upper {

	public static void main(String[] args) {

		String str = "Java Program";

		String lower = str.toLowerCase();
		System.out.println(lower);
		
		System.out.println(str.toUpperCase());
		
		// 사용자로 부터 찾고자 하는 글자를 입력 받아서
		// str에 글자가 포함되어 있는지 확인(대소문자 안가림)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("찾을 문자열 입력 : ");
		String sc1 = sc.next();
		
		String inputLower = sc1.toLowerCase();
		
		
		if(lower.contains(inputLower))
			System.out.println("찾는 문자열 없음");
		else
			System.out.println("찾는 문자열 있음");
		System.out.println(sc1.toLowerCase());
		System.out.println(sc1.toUpperCase());
	}

}
