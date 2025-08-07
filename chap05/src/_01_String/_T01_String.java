package _01_String;

public class _T01_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "홍길동";
		String hobby = "공부하기";
		
		System.out.println("name==hobby : " + name == hobby);
		

		String str1 = "java";
		String str2 = "java";
		System.out.println("str1==str2 : " + str1 == str2);
		
		String str3 = new String("program");
		String str4 = new String("program");
		System.out.println("str3==str4 : " + str3 == str4);
	}
}
