package _02_reperstive;

import java.util.Scanner;

public class T03_while {

	public static void main(String args[]) {
		int sum = 0;
		int i = 1;
		while(i<=100) {
			sum += i;
			i++;
			
			sum = sum + i++;
		}
		
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1문자 입력 : ");
			char ch = sc.next().charAt(0);
			
			System.out.println(ch);
			
			if(ch == 'q')
				break;
		}
		System.out.println("프로그램 종료");
		
		// 사용자로 부터 2개의 숫자를 입력받아 더한 숫자 출력
		// 0을 입력하면 종료
	}
}
