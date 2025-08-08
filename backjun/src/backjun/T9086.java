package backjun;

import java.util.Arrays;
import java.util.Scanner;

public class T9086 {

	//문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int k1 = sc.nextInt();
		// 문자열은 줄바꿈만 읽고 빈 문자열을 반환해야함.
		sc.nextLine();
		
		String[] result = new String[k1];
		
		for(int j = 0; j < k1; j++) {
				
			String test = sc.nextLine();
				
			char first = test.charAt(0);
			char last = test.charAt(test.length()-1);
			
			// "" << 안붙이면 char값 반환을 하지 않고, int형 반환함.
			result[j] = "" + first + last;
		}
		
		for(int i = 0; i<k1; i++) {
			System.out.println(result[i]);
		}
	}
}
