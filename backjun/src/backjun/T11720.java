package backjun;

import java.util.Scanner;

public class T11720 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		String word = sc.next();
		
		int sum = 0;
		
		for(int i=0; i<num; i++) {
			char k = word.charAt(i);
			
			sum += k-'0';
		}
		
		System.out.println(sum);
	}
}