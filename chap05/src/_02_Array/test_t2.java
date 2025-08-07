package _02_Array;

import java.util.Scanner;

public class test_t2 {

	public static void main(String args[]) {
		//	1. 길이 10인 배열을 선언하고 1~10까지 반복문을 
		//	   이용하여 순서대로 넣고 출력하기

		System.out.println("======== 1번 문제 ========");
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		for(int i=0; i<10; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
//		2. 길이 10인 배열을 선언하고 1~10까지 값을 반복문을
//		   이용하여 역순으로 배열 인덱스에 넣고 값 출력
		
		System.out.println("======== 2번 문제 ========");
		
		int[] arr2 = new int[10];
		for(int i = 0; i<10; i++) {
			arr[i] = (10-i)%11;
			
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
		System.out.println("======== 3번 문제 ========");
		// 사용자로 부터 입력받은 수 만큼 배열을 만들고
		//  1~입력받은 수를 차례대로 넣어 출력
		
		System.out.println("숫자를 입력하세요");
		
		int k1 = sc.nextInt();
		int[] arr3 = new int[k1];
		
		for(int i=0; i<k1; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.println("======== 4번 문제 ========");
		
//		 길이가 5일 배열에 사과,귤,포도,복숭아,참외로 초기화한후
//		   배열 인덱스를 이용하여 귤 출력
		
		String[] fruit = {"사과", "귤","포도","복숭아","참외"};
		
		System.out.println(fruit[1]);
		
		System.out.println();
		
		System.out.println("======== 5번 문제 ========");
		
//		문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
//		   개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력
//		   ex)
//		   문자열 : application
//		   문자 : i
//		   application에 i가 존재하는 위치(인덱스) : 4 8 
//		   i 개수 : 2
		System.out.print("문자열 : ");
		String k3 = sc.next();
		char[] arr5 = k3.toCharArray();
		
		int count = 0;
		
		System.out.print("문자 : ");
		char arn = sc.next().charAt(0);
		
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ", k3, arn);
		for(int j = 0; j<k3.length(); j++) {
			if(arr5[j] == arn) {
			
			System.out.print(j + " ");
			
			count++;
			}

		}
		System.out.println();
		
		System.out.printf("i 개수 : %d", count);
		
		System.out.println();
		
		System.out.println("======== 6번 문제 ========");
		
		String[] arr6 = {"월","화","수","목","금","토","일"};
		
		System.out.println("0 ~ 6 까지 입력");
		
		int q1 = sc.nextInt();
		
		if(q1 > 0 && q1 < 7) {
			
		} else
			System.out.print("다시 입력하렴");
	}
}
