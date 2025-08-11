package _06_constructor;

import java.util.Scanner;

public class backjun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int k1 = sc.nextInt();
		int k2 = sc.nextInt();
		
		int reverse = 0;
		int reverse1 = 0;
		
		while(k1 != 0) {
				int k3 = k1 % 10;
				reverse = reverse * 10 + k3;
				k1 = k1 / 10;
		}
		
		while(k2 != 0) {
				int k3 = k2 % 10;
				reverse1 = reverse1 * 10 + k3;
				k2 = k2 / 10;
		}	
		
		int result3 = reverse1 > reverse ? reverse1 : reverse;
		
		System.out.print(result3);
	}

}
