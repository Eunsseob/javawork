package _02_reperstive;

public class book_exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		for (int i = 1; i < 101 ; i++) {
			if(i%5 == 0)
				sum += i;
		}
		
		System.out.println("5의 배수의 합계는 " + sum);

	}
	// 결과 5의 배수의 합계는 1050
}
