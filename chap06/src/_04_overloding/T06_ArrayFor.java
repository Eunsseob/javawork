package _04_overloding;

public class T06_ArrayFor {

	public static void main(String[] args) {
		// 배열에서만 사용가능한 반복문
		// 전체배열만 가능
		int num[] = {1,2,3,4,5};
		
		// for(int i=0; i<num.length; i++)
		for(int result : num) {
			System.out.println(result);
		}
		
		String name[] = {"홍길동","이무개","강감찬"};
		for(String result : name) {
			System.out.println(result);
		}
		
		String name2[] = new String[3];
		int index = 0;
		for(String str : name) {
			name[index++] = str;
			System.out.println(name2[index--]);
		}
	}

}
