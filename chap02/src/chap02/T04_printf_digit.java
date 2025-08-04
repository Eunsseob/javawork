package chap02;

public class T04_printf_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%7d\n", 32000);
		System.out.printf("%7d\n", 3200000);
		System.out.printf("%7d\n", 3200);
		System.out.println("================");
		
		System.out.printf("%7d\n", 32000);
		System.out.printf("%7d\n", 3200000);
		System.out.printf("%7d\n", 3200);
		System.out.println("================");
		
		System.out.printf("%10s\n", "abcdefg");
		System.out.printf("%-10s", "abcdefg");
		System.out.printf("%s", "123");
		System.out.println("================");
		
		System.out.printf("%6.2f\n", 123.45);
		System.out.printf("%.3f", 123.4154685476);
	}

}
