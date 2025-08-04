package _02_Scanner;

import java.util.Scanner;

public class T01_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.println("이름은 : " + name);
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.println("나이는 : " + age);
		
		System.out.println("키를 입력하세요 : ");
		double key = sc.nextDouble();
		System.out.println("키 : " + key);

		System.out.println("당신은 여자입니까?(true/false)");
		boolean gender = sc.nextBoolean();
		System.out.println("당신은 여자입니까? : " + gender);
		
		sc.nextLine();
		
		System.out.print("주소를 입력하세요 : ");
		String address = sc.nextLine();
		System.out.println("주소 : "+ address);
		
		System.out.print("성별을 입력하세요 : ");
		char gender1 = sc.next().charAt(0); // index로 추출
		System.out.println("성별 : " + gender1);
		
	}

}
