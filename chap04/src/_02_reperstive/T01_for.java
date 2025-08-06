package _02_reperstive;

import java.util.Scanner;

public class T01_for {

	public static void main(String args[]) {


		for(int i=1; i<=100; i++) {
			System.out.println(i+". 안녕하세요");
			System.out.println("반갑습니다.");
		}
		System.out.println("----------------");
		
		for(int i=1; i<=10; i+=3) {
			System.out.println(i + ". 출력");
		}
		
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum += i;
			System.out.println("합계 : " + sum);
		}
	}
}	