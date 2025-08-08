package backjun;

import java.util.Scanner;

public class T10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String arg = sc.next();
		
		int[] arr = new int[26];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = -1;
		}
		
		for(int k = 0; k<arg.length(); k++) {
			char alp = arg.charAt(k);
			int idx = alp - 'a';
			
			if(arr[idx] == -1) {
				arr[idx] = k;
			}
		}
		
		for(int q = 0; q<arr.length; q++) {
			System.out.print(arr[q] + " ");
		}
	}
}
