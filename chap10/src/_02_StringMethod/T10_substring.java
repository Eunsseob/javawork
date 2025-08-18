package _02_StringMethod;

public class T10_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Spring aws start";
		String result = str.substring(7);
		System.out.println(result);
		
		result = str.substring(7,10);
		System.out.println(result);
		
		String sn = "040818-3124675";
		result = sn.substring(0,6);
		System.out.println(result);

		System.out.println(Integer.parseInt(sn.substring(0,2)) + "년"
				+ sn.substring(2,4) + "월"
				+ sn.substring(4,6) + "일");
		
		// 나이 출력을해보기
		
		int year = Integer.parseInt(sn.substring(0,2));
		if(year <= 25)
			year += 2000;
		else
			year += 1900;
		
		System.out.println("나이 : " + (2025-year) + "세 입니다.");
	}

}
