package _02_StringMethod;

import java.util.Scanner;

public class T01_charArray {

	public static void main(String[] args) {


		String str1 = new String("java project");
		String str2 = "java project";
		
		char[] chArr = {'컴', '퓨', '터'};
		String str3 = new String(chArr);
		System.out.println(str3);
		
		char ch = str3.charAt(1);
		System.out.println(ch);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호 입력 : ");
		
		char sn = sc.next().charAt(7);
		switch(sn) {
		case '1': case '3':
			System.out.println("남자");
		case '2': case '4':
			System.out.println("여자");
		}
		
	}
		
}
