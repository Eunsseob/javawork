package _04_interface.cop2;

import _03_interface.Inter;

public class InterRun {

	public static void main(String[] args) {
		InterClass i = new InterClass();
		i.print(5);
		i.method();
		// System.out.println(i.PI);
		System.out.println(Inter.PI);
		
		// 상수라서 변경 불가 i.max = 50;
		
		System.out.println("최대 값 : " + Inter.max);
		System.out.println(i.add(5,8));
	}

}
