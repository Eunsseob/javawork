package _02_reperstive;

public class T05_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int i = 1;
		for(i=1; i<=100; i++) {
			sum += i;
			if(sum > 1000)
				break;
		}
		System.out.println(i);
		System.out.println(sum);
		
		for(int dan=2; dan<=9; dan++) {
			for(int j=1; j<=9; j++) {
				System.out.println(dan + "*" + j + "=" + dan*j);
				if(j==5)
					break;
			}
			System.out.println();
		}
		System.out.println("---------------");		
	}

}
