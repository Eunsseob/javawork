package _02_StringMethod;

public class T06_indexOf {

	/*
	 * indexOf 오버로딩이 되어있음. 찾는 문자가 없으면 -1 반환, 있으면 index번호 반환
	 * indexOf() : 앞에서부터 살펴봄
	 * indexOf(char) : 앞에서부터 찾아서 char의 문자의 index번호 반환
	 * indexOf(char, fromIndex) : fromIndex 번호부터 char 문자를 찾아서 index번호 반환
	 * indexOf(String) : 앞에서부터 문자열의 시작 index번호 반환
	 * indexOf(String, fromIndex) : fromIndex번호부터 찾아서 문자열의 시작 index 번호 반환
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java program";
		int index = str.indexOf('a');
		System.out.println(index);
		
		index = str.indexOf('a', 5);
		System.out.println(index);

		index = str.indexOf("va");
		System.out.println(index);

		index = str.indexOf("ra", 5);
		System.out.println(index);
	}
}
