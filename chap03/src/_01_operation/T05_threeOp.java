package _01_operation;

import java.util.Scanner;

public class T05_threeOp {

	public static void main(String args[]) {
		int num1 = 4;
		int num2 = 7;
		
		char result = num1 < num2 ? '소' : '대';
		System.out.println(result);
		
		int num3 = -5;
		int result3 = num3 < 0 ? -num3 : num3;
		System.out.println(result3);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입럭 : ");
		int score = sc.nextInt();
		
		String result4 = score >= 80 ? "합격" : "불합격";
		System.out.println(result4);
		
//		score > 100 ? "점수를 잘못 입력하였습니다." : 
//			score >= 90 ? "A학점" :
//			score >= 80 ? "B학점" :
//				score >= 70 ? "C학점" :
//					score >= 60 ? "D학점" :
//						score > 0 ? "F학점" : "넌 F야";
//	}
	}
}
