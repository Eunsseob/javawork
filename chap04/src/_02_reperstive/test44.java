package _02_reperstive;

import java.util.Scanner;

public class test44 {
	public static void main(String args[]){
        int N = 10;
        
        int[] arr = new int[N];
        Scanner sc = new Scanner(System.in);
        
        boolean[] check = new boolean[42];
        
        for(int i=0; i<N; i++){
        	int k1 = sc.nextInt();
            arr[i] = k1%42;
        }
        
//        for(int i=0; i<N; i++) {
//        	System.out.print(arr[i] + " ");
//        }
        
        // 검증 로직
        for(int i=0; i<N; i++) {
        	check[arr[i]] = true;
        }
        
        int count = 0;
        
        for(int i=0; i<42; i++) {
        		if(check[i]) 
        			count++;
        		}
       
        System.out.println(count);
        
    }
}