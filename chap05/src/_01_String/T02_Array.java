package _01_String;

public class T02_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 배열
		 * 1. 같은 자료형을 연속된 저장곤간에 저장함
		 * 2. 배열의 길이는 늘리거나 줄일 수 없다.
		 */
		
//		int arrayInt[] = new int[10];
//		int[] arrayInt2 = new int[10];
//		
//		int[] arrayInt3 = {1,2,3,4,5};
//		
//		System.out.println(arrayInt3[0]);
//		System.out.println(arrayInt3[3]);
//		
//		arrayInt3[4] = 10;
//		
//		System.out.println(arrayInt3[0]);
//		System.out.println(arrayInt3[1]);
//		System.out.println(arrayInt3[2]);
//		System.out.println(arrayInt3[3]);
//		System.out.println(arrayInt3[4]);
//		
//		for(int i=0; i<5; i++) {
//			System.out.println(arrayInt3[i]);
//		}
//		
//		arrayInt3[0] = 0;
//		arrayInt3[1] = 2;
//		arrayInt3[2] = 4;
//		arrayInt3[3] = 6;
//		arrayInt3[4] = 8;
		// 문제
		
		/*
		 * 길이가 5인 배열에
		 * for문으로 값 0,3,6,9,12 넣기
		 * 값의 합계를 구하여 출력하기
		 */

		
		int[] arr = new int[5];
		
		for(int i=0; i<5; ++i) {
			arr[i] = i*3;
		}
		
		int k = 0;
		
		for(int i=0; i<5; i++) {
			k = k+arr[i];
		}
		
		System.out.println(k);
	}
	
	


}
