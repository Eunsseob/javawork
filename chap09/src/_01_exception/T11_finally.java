package _01_exception;

public class T11_finally {

	public static void main(String[] args) {
		try {
			int[] a = {1,2,3};
			System.out.println(a[0]);
//			System.out.println(a[6]);
			return;
			// 예외가 발생할 프로그램
		} catch(Exception e) {
			System.out.println("인덱스 범위 넘어섬");
			// 예외가 발생했을 때 실행될 프로그램
		} finally {
			System.out.println("프로그램 종료");
			// 예외와 상관없이 무조건 실행
			// try와 catch에 return 문이 있어도 실행됨
		}
		System.out.println("try 바깥 종료");
		// 여기에 써도 예외와 상관없이 무조건 실행
		// 차이점 : try와 catch에 return문이 있으면 실행 안됨
	}

}
