package _02_Array;

import java.util.Random;

public class T03_ex1 {

	public static void main(String args[]) {
		// 1. 총점, 평균 구하기
		
		int score[] = {10,20,304,40,10};
		
		int sum = 0;
		
		for(int i=0; i<5; i++) {
			sum = sum + score[i];
		}
		
		System.out.println("합은 : " + sum);
		
		System.out.println("평균 값은 : " + sum/5);
		
		// 2. 최대값, 최소값 구하기
		int num[] = {27, 89, 92, 16, 9, 109, 29, 3, 32, 45};
		
		int max = num[0];
		int min = num[0];
		
		for(int i = 0; i<10; i++) {
			if(max < num[i]) {
				max = num[i];
			} else if(min > num[i]) {
				min = num[i];
			}
		}
		
		System.out.println("최댓값은 : " + max);
		System.out.println("최솟값은 : " + min);
		
		
		// 3. 정수형 배열 10개를 만들어 랜덤함수를 이용하여 값넣기
		
		
		int[] arr1 = new int[10];
		for(int i=0; i<10; i++) {
			int intRand = (int)(Math.random() * 10)+1;
			
			arr1[i] = intRand;
			System.out.print(arr1[i]+" ");
		}
		
		
	}
}
