package _03_interface;

public class InterRun {

	public static void main(String[] args) {
		Inter i = new InterClass();
		i.print(5);
		i.method();
		System.out.println(i.PI);
		
		// 상수라서 변경 불가 i.max = 50;
		
		System.out.println("최대 값 : " + i.max);
	}

}
