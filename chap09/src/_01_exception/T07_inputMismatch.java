package _01_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T07_inputMismatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 3개를 입력하세요 : ");
		
		int sum = 0;
		
		for(int i=0; i<3; i++) {
			System.out.println(i+1 + "번째 정수 입력 : ");
			try {
				int k = sc.nextInt();
				sum += k;
			} catch (InputMismatchException e) {
				System.out.println("정수가 아닙니다");
				sc.next();
				i -= 1;
			}
		}
		
		System.out.println("합계 : " + sum);
	}
}
