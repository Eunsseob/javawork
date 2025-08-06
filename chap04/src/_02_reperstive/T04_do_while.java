package _02_reperstive;

import java.util.Scanner;

public class T04_do_while {

//	public static void main(String args[]){
//		
//		int b1 = 3;
//		
//		do {
//			System.out.println("do-while문");
//		} while(b1);
//		System.out.println("-------------");
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("1. for문 설명, 2. while문 설명, 3. do-while설명");
//		int num = sc.nextInt();
//		switch(num) {
//		case 1 : 
//			System.out.println("정해진 조건까지 반복할때 사용");
//			break;
//		case 2 : 
//			System.out.println("특정 조건에 도달했을때 break를 사용하여 종료");
//			break;
//		
//	    }
//	}
	
		    public static void main(String args[]){
	        Scanner sc = new Scanner(System.in);
	        
	        int k = sc.nextInt();
	        int[] arr = new int[k];
	        
	        int q = sc.nextInt();
	        
	        for(int i = 0; i < k; i++){
	            int k1 = sc.nextInt();
	            arr[i] = k1;
	        }
	        
	        for(int i = 0; i < k; i++){
	            if (arr[i] < q){
	                System.out.printf("%d ", arr[i]);
	            }
	        }
	    }
	}
