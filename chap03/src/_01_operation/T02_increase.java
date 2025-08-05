package _01_operation;

public class T02_increase {

	public static void main(String args[]) {
		int num1 = 10;
		num1++;
		System.out.println(num1);
		
		num1 = 10;
		num1--;
		num1--;
		num1++;
		System.out.println(num1);
		
		num1 = 10;
		num1++;
		
		num1 = 10;
		++num1;
		
		int num2 = 10;
		int num3 = 10;
		
		int result = ++num2 + num3++;
		System.out.println(result);
		System.out.println(num2);
		System.out.println(num3);
	}
}
