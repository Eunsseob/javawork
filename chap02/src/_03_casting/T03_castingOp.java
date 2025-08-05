package _03_casting;

public class T03_castingOp {

	public static void main(String args[]) {
		byte b1 = 10;
		byte b2 = 20;
		
		int result2 = b1 + b2;
		
		char c1 = 'A';
		
		int c3 = c1+5;
		
		char c4 = (char)c3;
		
		System.out.println(c4);
		
		System.out.println((char)c3);
		
		int num1 = 100;
		int num2 = 3;
		int result3 = num1 / num2;
		System.out.println(result3);
		
		double dou1 = 3;
		double result4 = num1 / dou1;
		System.out.println(result4);
		
		int int1 = (int)(num1 / dou1);
		int int2 = num1 / (int)dou1;
	}
}
