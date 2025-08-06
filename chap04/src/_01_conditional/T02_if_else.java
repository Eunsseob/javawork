package _01_conditional;

import java.util.Scanner;

public class T02_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 97;
		if(score >= 70) {
			System.out.println("합격입니다");
			System.out.println("축하합니다");
		} else {
			System.out.println("불합격입니다.");
			System.out.println("다음 기회에!!");
		}
		
		System.out.println();
		
		int num1 = -100;
		if(num1 >= 0)
			System.out.println("양수입니다");
		else
			System.out.println("음수입니다.");
		
		// 사용자로부터 숫자하나 입력 받아 짝수 홀수 구분
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 하나 입력하시오");
		int k = sc.nextInt();
		if(k%2 == 1) {
			System.out.println("홀수입니다.");
		} else {
			System.out.println("짝수입니다.");
		}
	}

}
