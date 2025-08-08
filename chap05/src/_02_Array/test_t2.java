package _02_Array;

import java.util.Arrays;
import java.util.Scanner;

public class test_t2 {

	public static void main(String args[]) {
		//	1. 길이 10인 배열을 선언하고 1~10까지 반복문을 
		//	   이용하여 순서대로 넣고 출력하기

//		System.out.println("======== 1번 문제 ========");
//		Scanner sc = new Scanner(System.in);
//		
//		int[] arr = new int[10];
//		
//		for(int i=0; i<10; i++) {
//			arr[i] = i+1;
//			System.out.print(arr[i] + " ");
//		}
//		
//		System.out.println();
////		2. 길이 10인 배열을 선언하고 1~10까지 값을 반복문을
////		   이용하여 역순으로 배열 인덱스에 넣고 값 출력
//		
//		System.out.println("======== 2번 문제 ========");
//		
//		int[] arr2 = new int[10];
//		for(int i = 0; i<10; i++) {
//			arr[i] = (10-i)%11;
//			
//			System.out.print(arr[i]+ " ");
//		}
//		System.out.println();
//		
//		System.out.println("======== 3번 문제 ========");
//		// 사용자로 부터 입력받은 수 만큼 배열을 만들고
//		//  1~입력받은 수를 차례대로 넣어 출력
//		
//		System.out.println("숫자를 입력하세요");
//		
//		int k1 = sc.nextInt();
//		int[] arr3 = new int[k1];
//		
//		for(int i=0; i<k1; i++) {
//			arr[i] = i+1;
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println();
//		
//		System.out.println("======== 4번 문제 ========");
//		
////		 길이가 5일 배열에 사과,귤,포도,복숭아,참외로 초기화한후
////		   배열 인덱스를 이용하여 귤 출력
//		
//		String[] fruit = {"사과", "귤","포도","복숭아","참외"};
//		
//		System.out.println(fruit[1]);
//		
//		System.out.println();
//		
//		System.out.println("======== 5번 문제 ========");
//		
////		문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
////		   개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력
////		   ex)
////		   문자열 : application
////		   문자 : i
////		   application에 i가 존재하는 위치(인덱스) : 4 8 
////		   i 개수 : 2
//		System.out.print("문자열 : ");
//		String k3 = sc.next();
//		char[] arr5 = k3.toCharArray();
//		
//		int count = 0;
//		
//		System.out.print("문자 : ");
//		char arn = sc.next().charAt(0);
//		
//		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ", k3, arn);
//		for(int j = 0; j<k3.length(); j++) {
//			if(arr5[j] == arn) {
//			
//			System.out.print(j + " ");
//			
//			count++;
//			}
//
//		}
//		System.out.println();
//		
//		System.out.printf("i 개수 : %d", count);
//		
//		System.out.println();
//		
//		System.out.println("======== 6번 문제 ========");
//		
//		String[] arr6 = {"월","화","수","목","금","토","일"};
//		
//		System.out.println("0 ~ 6 사이 숫자 입력 : ");
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int q1 = sc.nextInt();
//		
//		if(q1 >= 0 && q1 < 7) {
//			System.out.println(arr6[q1]);
//		} else
//			System.out.print("다시 입력하렴");
//		
//		System.out.println();
//		
//		System.out.println("======== 7번 문제 ========");
//		
//		System.out.print("배열 크기를 입력하세요 : ");
//		
//		int arr7 = sc.nextInt();
//		
//		int[] s1 = new int[arr7];
//		
//		int sum = 0;
//		
//		System.out.println("배열에 넣을 값을 입력하세요 : ");
//		
//		for(int i=0; i< arr7; i++) {
//			s1[i] = sc.nextInt();
//			sum += s1[i]; 
//		}
//		
//		System.out.print(sum);
//		
//		System.out.println();
		
//		System.out.println("======== 8번 문제 ========");
//		
//		while(true) {System.out.println("3이상인 홀수 자연수를 입력 하세요");
//		
//		System.out.print("정수 : ");
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int s8 = sc.nextInt();
//		
//		if(s8 >=3 && s8 % 2 == 1) {
//			int[] iArr = new int[s8];
//		int value = 1;
//		for(int i=0; i<iArr.length; i++) {
//			if(i < s8/2)
//				iArr[i] = value++;
//			else
//				iArr[i] = value--;
//			}
//				System.out.print(Arrays.toString(iArr));
//				break;
//			}else {
//			System.out.println("다시 입력하세요");
//			}
//		}
//		
//		System.out.println();
//		
//		System.out.println("======== 9번 문제 ========");
//		
//		String[] chicken = {"후다닭","교촌","BHC"};
//		
//		System.out.print("치킨 이름을 입력하세요 : ");
//		
//		Scanner sc = new Scanner(System.in);
//		
//		String chick = sc.nextLine();
//		
//		int i=0;
//		
//		for(i = 0; i < chicken.length; i++) {
//			if(chicken[i].equals(chick)) {
//				System.out.print(chick + "치킨 배달 가능");
//				break;
//			}
//		}
//		
//		if (i == chicken.length) {
//			System.out.print(chick + "치킨은 없는 메뉴입니다.");
//		}
			
//		System.out.println();
//			
//		System.out.println("======== 10번 문제 ========");
//		
//		int[] arr1 = new int[10];
//		
//		int i = 0;
//		
//		for(i=0; i<arr1.length; i++) {
//			int index = (int)(Math.random()*10)+1;
//			arr1[i] = index;
//			
//			System.out.print(arr1[i] + " ");
//		}
//		
//		int max = arr1[0];
//		int min = arr1[0];
//		
//		for(i = 0; i<arr1.length; i++) {
//			if(max < arr1[i]) {
//				max = arr1[i];
//			} else if(min > arr1[i]) {
//				min = arr1[i];
//			}
//		}
//		
//		System.out.println("\n"
//				+ "최댓값은 : " + max);
//		System.out.println("최솟값은 : " + min);
//			
//		System.out.println("======== 11번 문제 ========");
//			
//		Scanner k1 = new Scanner(System.in);
//				
//		int[] arr = new int[5];
//		
//		System.out.print("배열 5개 입력");
//		
//		for(int k = 0; k < 5; k++) {
//			int q11 = k1.nextInt();
//			arr[k] = q11;
//		}
//		
//		int count = 0;
//		
//		for(i =0; i<arr.length-1 ; i++) {
//			boolean flag = false;
//			for(int j=0; j<arr.length-i-1; j++) {
//				if(arr[j] > arr[j+1]) {
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//					flag = true;
//				}
//			}
//			count++;
//			
//			if(!flag)
//				break;
//		}
			
//		System.out.println(Arrays.toString(arr));
		
		System.out.println("======== 12번 문제 ========");
		System.out.println("==========================");
		
		System.out.print("번호\t국어\t영어\t수학\t총점\t평균\n");
        
		int[][] iArr12 = {{1, 95, 100, 78, 0, 0},
				{2,68,57,100, 0, 0},
				{3,62,97,85, 0, 0},
				{4,85,83,69, 0, 0},
				{5,86,74,38, 0, 0},
		};
		
		for(int i = 0; i<iArr12.length; i++) {
			int sum = iArr12[i][1] + iArr12[i][2] + iArr12[i][3];
			int avg = sum/3;
			iArr12[i][4] = sum;
			iArr12[i][5] = avg;
		}
		for(int i=0; i<iArr12.length; i++) {
			for(int j=0; j<iArr12[i].length; j++) {
				System.out.print(iArr12[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("==========================");
		
		int sum1 = 0;
		// 

		System.out.print("총점" + "\t");
		for(int j=1; j<4; j++) {
			int sub = 0;
			for(int i = 0; i<iArr12.length; i++) {
			
				sub += iArr12[i][j];
			}
			System.out.print(sub + "\t");
		}
		
		System.out.print("\n" + "평균" + "\t");
		for(int j=1; j<4; j++) {
			int avg = 0;
			for(int i = 0; i<iArr12.length; i++) {
			
				avg += iArr12[i][j];
			}
			double avg2 = (double)avg/5;
			System.out.print(avg2 + "\t");
		}
	}
}
