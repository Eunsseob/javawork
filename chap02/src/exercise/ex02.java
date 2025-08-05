package exercise;

import java.util.Scanner;

public class ex02 {

	public static void main(String args[]) {
		// 이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("----------- 1번 문제 -----------\n");
		
//		ex.
//		   이름을 입력하세요 : 아무개
//		   성별을 입력하세요(남/여) : 남
//		   나이를 입력하세요 : 20
//		   키를 입력하세요(cm) : 180.5
		
		System.out.print("이름을 입력하세요 : ");
		String n = sc.nextLine();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		char g = sc.next().charAt(0);
		
		System.out.print("나이를 입력하세요 : ");
		int a = sc.nextInt();
		
		System.out.print("키를 입력하세요(cm) : ");
		float k = sc.nextFloat();
		System.out.printf("----------- 1번 결과 -----------\n");
		
		System.out.printf("키 %.1fcm인 %d살 %c자 %s님 반갑습니다^^\n\n",k,a,g,n);
		
		System.out.printf("----------- 2번 문제 -----------\n");
		
		System.out.print("첫 번재 정수 : ");
		int fir = sc.nextInt();
		
		System.out.print("두 번재 정수 : ");
		int sec = sc.nextInt();
		
		System.out.printf("----------- 2번 결과 -----------\n");
		System.out.printf(">>> 더하기 결과 %d\n", fir+sec);
		System.out.printf(">>> 빼기 결과 %d\n", fir-sec);
		System.out.printf(">>> 곱하기 결과 %d\n", fir*sec);
		System.out.printf(">>> 나누기 몫 결과 %d\n\n", fir/sec);
		
		System.out.printf("----------- 3번 문제 -----------\n");
		System.out.print("가로 길이 : ");
		float row = sc.nextFloat();
		
		System.out.print("세로 길이 : ");
		float hei = sc.nextFloat();
		
		System.out.printf("----------- 3번 결과 -----------\n");
		System.out.printf(">>> 면적 결과 %.2f\n", row*hei);
		System.out.printf(">>> 둘레 결과 %.1f\n\n", (row+hei)*2);
		
		System.out.printf("----------- 4번 문제 -----------\n");
		System.out.print("문자열을 입력하세요 : ");
		String a1 = sc.next();
		
		System.out.printf("----------- 4번 결과 -----------\n");
		System.out.printf("첫 번째 문자 : %c\n", a1.charAt(0));
		System.out.printf("두 번째 문자 : %c\n", a1.charAt(1));
		System.out.printf("세 번째 문자 : %c\n", a1.charAt(2));
	}
}
