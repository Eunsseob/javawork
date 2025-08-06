package _02_reperstive;

public class T07_for_여러변수사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3;
		num1 = num2 = num3 = 10;
		
		int num4 =10, num5=20, num6=30;
		
		for(int i=1, j=20; j<=11; i++, j--) {
			System.out.println("i = " + i + ", j = " + j);
		}

		for(int i=1, j=20, z = 100; j<=11; i++, j--, z+=5) {
			System.out.println("i = " + i + ", j = " + j + ", z" + z);
		}
		
		for(;;) {
			System.out.println(num1++);
			if(num1 == 15)
				break;	
		}

	}

}
