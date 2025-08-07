package _01_String;

import java.util.Scanner;

public class test_back {

//	public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        
//        int K = sc.nextInt();
//        double[] arr = new double[K];
//        
//        for(int i = 0; i<K; i++){
//            int score = sc.nextInt();
//            arr[i] = score;
//        }
//        
//        double max = 0;
//        
//        for(int i=0; i<K; i++){
//            if(arr[i]>max){
//                max = arr[i];
//            }
//        }
//        
//        for(int j=0; j<K; j++){
//            arr[j] = arr[j] * 100 / max;
//        }
//        
//        double total = 0;
//        
//        for(int i=0; i<K; i++) {
//        	total += arr[i];
//        }
//        
//        System.out.println(total/K);
//        
//    }
	
//	public static void main(String args[]) {
//		
//		Scanner sc = new Scanner(System.in);
//		int k1 = sc.nextInt();
//		int k2 = sc.nextInt();
//		
//		int[] arr = new int[k1];
//		
//		for(int i = 0; i<k1; i++) {
//			arr[i] = i+1;
//		}
//			
//		for(int j = 0; j<k2; j++) {
//			int q1 = sc.nextInt()-1;
//			int q2 = sc.nextInt()-1;
//			
//			while(q1<q2) {
//				int temp = arr[q1];
//				arr[q1] = arr[q2];
//				arr[q2] = temp;
//				q1++;
//				q2--;
//			}
//		}
//		
//		for(int i = 0; i<k1; i++) {
//			System.out.print(arr[i]
//					+ " ");
//		}
//	}
	
//	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		
//		String k4 = sc.nextLine();
//		int k2 = sc.nextInt();
//	
//		char[] arr = k4.toCharArray();
//		System.out.println(arr[k2-1]);
//	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int k1 = sc.nextInt();
		
		for(int i=0; i<k1+1; i++) {
			String word = sc.nextLine();
			char[] arr = word.toCharArray();
			
//			System.out.print(arr[i]);
//			System.out.print(arr[-1]);
		}
		
//		System.out.print(arr[1]);
//		System.out.print(arr[-1]);
	}
}
