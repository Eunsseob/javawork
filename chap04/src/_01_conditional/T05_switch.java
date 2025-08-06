package _01_conditional;

import java.util.Scanner;

public class T05_switch {

	public static void main(String args[]) {
		int num1 = 2;
		
		switch(num1) {
		
		case 1:
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
			default : 
				System.out.println("123을 제외한 수");
		}
		
		System.out.println("----------------");
		
		char ch = 'k';
		
		switch(ch) {
		case 'k':
			System.out.println("김씨입니다.");
			break;
		case 'l':
			System.out.println("이씨입니다.");
			break;
		case 'p':
			System.out.println("박씨입니다.");
			break;
		}
		
//		String str = "더조은";
//		switch(str) {
//		case "더조은" :
		
		System.out.println("---------------");
		
		int month = 3;
		switch(month) {
		case 1:
		case 2:
		case 12:
			System.out.println("겨울");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		}
		// 문제 1
		System.out.println("---------------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사칙연산 하나를 입력해주세요");
		String s = sc.nextLine();
		
		System.out.println("두 숫자를 입력해주세요");
		int k = sc.nextInt();
		int q = sc.nextInt();
		
		switch (s) {
		case "+":
			System.out.printf("더하기 값은 >> %d 입니다.", k+q);
			break;
		case "-":
			System.out.printf("빼기 값은 >> %d 입니다.", k-q);
			break;
		case "*":
			System.out.printf("곱하기 값은 >> %d 입니다.", k*q);
			break;
		case "/":
			System.out.printf("몫은 >> %d 입니다.", k/q);
			break;
		case "%":
			System.out.printf("나머지 값은 >> %d 입니다.", k%q);
			break;
		}
		
	}
}
