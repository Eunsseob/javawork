package com;

import java.util.Scanner;

public class backjun2 {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		int k1 = 2;
		int k2 = 2;
		
		try {
			while(k1 > 0 && k2 < 10) {
			k1 = sc.nextInt();
			k2 = sc.nextInt();
			
			System.out.println(k1+k2);
			}	
		} catch(Exception e) {
			
		}
	}
}
