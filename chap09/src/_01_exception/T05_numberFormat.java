package _01_exception;

public class T05_numberFormat {

	public static void main(String[] args) {
		String[] str = {"23", "17", "a", "3.4123"};
		for(int i=0; i<str.length; i++) {
			
		try {
				int num = Integer.parseInt(str[i]);
				System.out.println(num);
		} catch(NumberFormatException e) {
			System.out.println(str[i] + "는 정수로 변환 불가");
			}
		}

	}

}
