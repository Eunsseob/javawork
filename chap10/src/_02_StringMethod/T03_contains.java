package _02_StringMethod;

public class T03_contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "HTML 프로그래밍";
		
		boolean result = str.contains("java");
		System.out.println(result);

		if(str.contains("HTML"))
			System.out.println("웹페이지를 만드는 프로그램");
		else
			System.out.println("기타 프로그램");
	}

}
