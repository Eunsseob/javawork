package _02_reperstive;

import java.util.Scanner;

public class test {

	
	// 문제 1 사용자로 부터 2개의 숫자를 입력받아 더한 숫자 출력
	// 0을 입력하면 종료
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int k1 = sc.nextInt();
		if(k1 == 0) {
			System.out.println("0입력은 프로그램 종료");
			return;
		}
		int k2 = sc.nextInt();
		if(k2 == 0) {
			System.out.println("0입력은 프로그램 종료");
			return;
		}
		
		System.out.printf("더 한 값은 >>> %d", k1 + k2);
	}
}
