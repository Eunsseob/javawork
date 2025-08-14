package _02_StringMethod;

import java.util.Scanner;

public class T01_charArray {

	public static void main(String[] args) {


		String str1 = new String("java project");
		String str2 = "java project";
		
		char[] chArr = {'컴', '퓨', '터'};
		String str3 = new String(chArr);
		System.out.println(str3);
		
		char ch = str3.charAt(1);
		System.out.println(ch);
	}
		
}
