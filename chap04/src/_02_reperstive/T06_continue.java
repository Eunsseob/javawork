package _02_reperstive;

public class T06_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		for(int i = 1; i<=100; i++) {

			if(i%3 == 0)
				continue;
			
			sum += i;
		}
		
		System.out.println("3의 배수를 제외한 1~100 까지의 합계 : " + sum);
	}

}
