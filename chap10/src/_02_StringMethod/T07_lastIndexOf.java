package _02_StringMethod;

/*
 * lastindexOf 오버로딩이 되어있음. 찾는 문자가 없으면 -1 반환, 있으면 index번호 반환
 * lastindexOf() : 앞에서부터 살펴봄
 * lastindexOf(char) : 앞에서부터 찾아서 char의 문자의 index번호 반환
 * lastindexOf(char, fromIndex) : fromIndex 번호부터 char 문자를 찾아서 index번호 반환
 * lastindexOf(String) : 앞에서부터 문자열의 시작 index번호 반환
 * lastindexOf(String, fromIndex) : fromIndex번호부터 찾아서 문자열의 시작 index 번호 반환
 */

public class T07_lastIndexOf {

	public static void main(String[] args) {

		String str = "abcabcabca";
		System.out.println(str.lastIndexOf('a'));
		System.out.println(str.lastIndexOf("abc"));
		
		System.out.println(str.lastIndexOf("abc",6));
		System.out.println(str.lastIndexOf("abc",4));
		System.out.println(str.lastIndexOf("abc",5));
		

	}

}
