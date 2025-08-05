package exercise;

import java.lang.Character.UnicodeBlock;
import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1번 문제. 문자 하나를 입력받아 그 문자의 유니코드를 출력하기
		
		System.out.println("1번문제 >>> 문자 하나 입력");
		
		Scanner sc = new Scanner(System.in);
		
		char k = sc.next().charAt(0);
		
		System.out.printf(">> 유니코드 출력 U+%04X\n",(int)k);
		
		// 2번 문제 국어, 영어, 수학 점수를 입력받아 총점 출력
		// 평균 출력(소수점 2째자리까지 출력)
		
		System.out.println("2번 문제\n 국어 점수 입력");
		
		int kor = sc.nextInt(); 
		
		System.out.println(">> 수학 점수 입력");
		
		int eng = sc.nextInt(); 
		
		System.out.println(">> 영어 점수 입력");
		
		int math = sc.nextInt();
		
		System.out.println(">> 총 점수는 >>> " + (kor+eng+math));
		System.out.printf(">> 총 평균은 >>> %.2f\n", ((float)(kor+eng+math)/3));
		
		System.out.printf("3번 문제\n");
		/* int iNum1 = 10;
	    int iNum2 = 4;
	    float fNum = 3.0f;
	    double dNum = 2.5;
	    char ch = 'K'; */
		
		int iNum1 = 10;
	    int iNum2 = 4;
	    float fNum = 3.0f;
	    double dNum = 2.5;
	    char ch = 'K'; 
	    
	    double d = (double)iNum2 * dNum;
	    
	    System.out.printf(">> 3.1 몫 출력 >>> %d\n", iNum1/iNum2);
	    System.out.printf(">> 3.2 곱 결과 변수에 넣고 출력 >>> %d\n", (int)d);
	    System.out.printf(">> 3.3 iNum1값 10.0 출력 >>> %.1f\n", (float)iNum1);
	    System.out.printf(">> 3.4 소수점 값 다 나오게 하기 >>> %f\n", (float)iNum1/(float)iNum2);
	    System.out.printf(">> 3.5 iNum1/iNum 결과 3 나오게 하기 >>> %d\n", iNum1/(int)fNum);
	    System.out.printf(">> 3.6 iNum1/fNum 결과 소수점 13자리 이상 >>> %.15f\n", (float)iNum1/(float)fNum);
	    System.out.printf(">> 3.7 ch변수의 유니코드 출력 >>> U+%04X\n", (int)ch);
	    System.out.printf(">> 3.8 ch변수의 1을 더해 L값 출력 >>> %c\n", ch+1);
	}
}
