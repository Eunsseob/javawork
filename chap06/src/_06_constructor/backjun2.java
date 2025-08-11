package _06_constructor;

import java.util.Scanner;

public class backjun2 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String ak = sc.nextLine().trim(); // trim은 공백 제거 용도
		
		int count = 1;
		
		if(ak.isEmpty()) {
			count = 0;
		} else
			for(int i = 1; i<ak.length(); i++) {
				
			int ak1 = ak.charAt(i);
			
			if(ak1 == 32) {
				count ++;
			}
		}
		System.out.println(count);
	}
}
