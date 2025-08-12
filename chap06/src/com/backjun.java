package com;

import java.util.Scanner;

public class backjun {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		StringBuilder result = new StringBuilder();
		
		for(int q = 0; q < count; q++) {
			int k = sc.nextInt();
			String k1 = sc.next();
			
			for(int j=0; j<k1.length(); j++) {
				for(int i=0; i<k; i++) {
					char hi = k1.charAt(j);
					result.append(hi);
				} 
			}
			result.append("\n");
		}
		System.out.println(result);
	}
}
