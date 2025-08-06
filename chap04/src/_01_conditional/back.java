package _01_conditional;

import java.util.Scanner;

// 백준 10807 번
public class back {

	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] arr = new int[N];
        
        for(int i = 0; i < N; i++) {
        	arr[i] = sc.nextInt();
        }
        
        int k = sc.nextInt();
        
        int q = 0;
        
        for(int i = 0; i < N; i++) {
        	if (arr[i] == k)
        	q++;
        }
        
        System.out.println(q);
    }
}