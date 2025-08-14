package _01_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T10_exception {

	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 3개를 입력하세요 : ");
		
		int sum = 0;
		int[] num  = new int[3];
		
		for(int i=0; i<3; i++) {
			System.out.println(i+1 + "번째 정수 입력 : ");
			num[i] = sc.nextInt();
			sum += num[i];
		} 
		num[3] = 5;
		System.out.println("합계 : " + sum);
	} catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("배열의 범위를 넘어섬");
	} catch(Exception e) {
		System.out.println("예왜 발생");
		e.printStackTrace();
	}
		// Exception 주의사항
}
}
