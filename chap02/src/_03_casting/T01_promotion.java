package _03_casting;

public class T01_promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b1 = 20; // 1바이트 
		short s1 = b1; // 2바이트
		
		int int1 = b1; // 4바이트
		int1 = s1;
		
		char ch1 = '김';
		int intch = ch1;
		
		System.out.println(ch1);
		System.out.println(intch);
		
		double d1 = int1;
		System.out.println(d1);
		
		int int2 = s1+1;
	}

}
