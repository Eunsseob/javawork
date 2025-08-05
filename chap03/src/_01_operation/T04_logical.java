package _01_operation;

public class T04_logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 20;
		
		boolean result = num1 > num2 && num1 < num2;
		System.out.println("논리곱 : "+ result);
		
		result = num1 > num2 || num1 < num2;
		System.out.println();
		
		char ch1 = 'K';
		
		System.out.println("ch1 : " + ch1);
		System.out.println("소문자 인가 ? " + (ch1 >= 'a' && ch1 <= 'z'));
		System.out.println("대문자 인가 ? " + (ch1 >= 'A' && ch1 <= 'Z'));
	}

}
