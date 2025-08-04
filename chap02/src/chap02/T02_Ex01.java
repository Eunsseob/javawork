package chap02;

import java.util.Scanner;

public class T02_Ex01 {

	public static void main(String[] args) {
		// 국어, 컴퓨터, 수학 점수를 사용자로부터 입력받아 저장하고
		// 총점과 평균을 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수는 : ");
		int korean = sc.nextInt();
		
		System.out.print("컴퓨터 점수는 : ");
		int computer = sc.nextInt(); 

		System.out.print("수학 점수는 : ");
		int math = sc.nextInt();
		
		int sum = korean+computer+math;
		
		double avg = sum/3;
		
		System.out.println("총 점수는 : " + sum);
		System.out.println("총 평균은 : " + avg);
	}

}
