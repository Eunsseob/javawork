package _01_operation;

import java.util.Scanner;

public class ex_chap03 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("----------- 문제 1번 -----------\n");
		System.out.printf("<양수 음수 테스트> 숫자하나 입력해봐 : ");
		int jong = sc.nextInt();
		
		String jong1 = jong > 0 ? "양수" : "음수";
		System.out.println(jong1);
		
		System.out.printf("----------- 문제 2번 -----------\n");
		System.out.printf("<양수, 0, 음수 테스트> 숫자하나 입력해봐 : ");
		int jong2 = sc.nextInt();
		
		String jong3 = jong2 > 0 ? "양수" : 
			jong2 == 0 ? "0은 양수 음수 아님" : "음수";
		System.out.println(jong3);
		
		System.out.printf("----------- 문제 3번 -----------\n");
		System.out.printf("<홀수, 짝수 판별> 숫자 하나 입력해봐 : ");
		int son1 = sc.nextInt();
		
		String son2 = son1/2 == 0 ? "홀수" : "짝수";
		System.out.println(son2);
		
		System.out.printf("----------- 문제 4번 -----------\n");
		System.out.println("<각 인원수, 사탕갯수를 입력해봐 : >");
		int person = sc.nextInt();
		int pop = sc.nextInt();
		
		System.out.printf("남은 사탕의 갯수 : %d\n", pop%person);
		
		System.out.printf("----------- 문제 5번 -----------\n");
		
		System.out.printf("이름 : ");
		String name = sc.next();
		
		System.out.printf("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.printf("반(숫자만) : ");
		int class1 = sc.nextInt();
		
		System.out.printf("번호(숫자만) : ");
		int number = sc.nextInt();
		
		System.out.printf("성별(M/F) : ");
		char sex = sc.next().charAt(0);
		String sex1 = sex == 'M' ? "남학생" : "여학생"; 
		
		System.out.printf("성적(소수점 둘재 자리까지) : ");
		double score = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.\n", grade, class1, number, name, sex1, (double)score);
		
		System.out.printf("----------- 문제 6번 -----------\n");
		
		System.out.printf("나이를 입력하시오 : ");
		
		int age22 = sc.nextInt();
		String age23 = age22 >= 20 ? "성인" :
			age22 >= 14 ? "청소년" : "어린이";
		System.out.println(age23);
		
		System.out.printf("----------- 문제 7번 -----------\n");
		
		System.out.printf("국어 영어 수학 점수 차례대로 입력 : \n");
		
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		String total = (kor+eng+math)/3 >= 60 && kor>= 40 && eng >=40 && math >= 40 ? "합격" : "불합격";
		System.out.println(total);
		
		System.out.printf("----------- 문제 8번 -----------\n");
		
		System.out.printf("주민번호를 입력하세요(- 포함) : \n");
		char sex2 = sc.next().charAt(7);
		String sex3 = sex2 == '1' ? "남자" :
			sex2 == '2' ? "여자" : "너 21세기 사람이지?";
		
		System.out.println(sex3);
		
		System.out.printf("----------- 문제 9번 -----------\n");
		System.out.printf("값 두개 받습니다. \n");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		// num1 은 그러면 50 100
		System.out.printf("값 하나 받습니다. \n");
		int num3 = sc.nextInt();
		// num3 은 120
		String kk = num3 < num1 || num3 > num2 ? "true" : "false";
		
		System.out.println(kk);
		
		System.out.printf("----------- 문제 10번 -----------\n");
		System.out.printf("값 세개 받습니다. \n");
		int test1 = sc.nextInt();
		int test2 = sc.nextInt();
		int test3 = sc.nextInt();
		
		String test4 = test1 == test2 && test2 == test3 ? "true" : "false";
		System.out.println(test4);
	}
}
