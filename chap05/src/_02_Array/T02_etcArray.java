package _02_Array;

import java.util.Scanner;

public class T02_etcArray {

	public static void main(String args[]) {
		char chArr[] = {'a', 'b', 'c'};
		String strArr[] = {"홍길동", "한빛나", "%^&"};
		boolean bArr[] = {true, false, true, false};
		double dArr[] = {3.14, 56.78, 14.45};
		
		// 문제 문자열을 3개를 넣을 수 있는 배열을 만들어 사용자로부터 입력받아 넣기
		
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[3];
		for(int i=0; i<3; i++) {
			System.out.printf("%d번째 이름 입력 : ", i+1 );
			String k1 = sc.next();
			arr[i] = k1;
			// System.out.printf("%s", k1);
		}
	}
}
