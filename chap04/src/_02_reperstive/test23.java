package _02_reperstive;

import java.util.Scanner;

public class test23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1.  주사위의 숫자 맞추기 게임
//	    랜덤으로 주사위숫자(1~6숫자 중 1개) 만들기
//	    사용자로 부터 숫자 입력받아서
//	    숫자를 맞추면 '축하합니다. 맞췄습니다' 하고 끝내기
//	    못맞췄으면 계속 물어보기
		
		int intRand = (int)(Math.random()*6) + 1;
		System.out.println(intRand);
		
		Scanner sc = new Scanner(System.in);
		int k1;
		
		do {
			System.out.print("숫자 하나를 입력하세요 >>>");
			k1 = sc.nextInt();
			
			if(k1 != intRand) {
				System.out.println("다시 던져 보세요");
			}
		} while(k1 != intRand); 
			System.out.println("ㅊㅋ 맞췄습니다.");
	}
}
