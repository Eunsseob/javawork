package _01_conditional;

import java.util.Scanner;

// 백준 25304번
public class back01 {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int total = sc.nextInt();
        
        int jongru = sc.nextInt();
        int[] arr = new int[jongru];
        
        for(int i = 0; i<jongru; i++){
            int total1 = sc.nextInt();
            int jongru2 = sc.nextInt();
        
            arr[i] = total1*jongru2;
        }
        
        int fitotla = 0;
        for(int i = 0; i<jongru; i++){
            fitotla += arr[i]; 
        }
        
        String name = total == fitotla ? "Yes" : "No";
        System.out.println(name);
    }
}
