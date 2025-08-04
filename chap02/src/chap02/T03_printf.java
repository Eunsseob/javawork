package chap02;

import java.util.Date;

public class T03_printf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%d\n", 3);
		System.out.printf("%d, %d\n", 10, 20);
		
		int num1 = 100;
		int num2 = 200;
		
		System.out.printf("%d, %d\n", num1, num2);
		
		System.out.printf("%o\n", 9);
		
		System.out.printf("%X\n", 10);
		
		System.out.printf("%f\n", 5.777777);
		
		System.out.printf("%c\n", 'a');

		System.out.printf("%s\n", "Asdasdas");
		
		System.out.printf("%b\n", true);
		System.out.printf("%b\n", 10>4);
		
//		Date date = new Date();
//		
//		System.out.print(date);
//		
		// 문제 
		System.out.printf("현재는 %d년 %d월 이고, 우리나라의 평균 온도는 %.1f 도 입니다.\n", 2025, 8, 34.5);
		System.out.printf("이 과정의 정원은 %d명이고, 현재 %d명이 수강중입니다. %d%c 달성 하였습니다.", 25, 19, 76, '%');
	}
}