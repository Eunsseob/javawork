package _02_reperstive;

public class book_exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for (int i = 1; i < 101 ; i++) {
//			if(i%5 == 0)
//				sum += i;
//		}
//		
//		System.out.println("5의 배수의 합계는 " + sum);
//
//		
//		for(int x=1; x<=6; x++) {
//			for(int y=1; y<=6; y++) {
//				if(x+y == 6) {
//					System.out.printf("(%d,%d)\n",x,y);
//				}
//			}
//		}
		
//		for(int i = 5; i<5; i++) {
//			for(int j =1; j<=i; j++) {
//			System.out.println("*");
//		}
//			System.out.println();
//		}
		
		// 6.
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<4-i; j++) {
//				System.out.print(" ");
//			}
//			for(int x=0; x<i*2+1; x++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// 7.
		int count =1;
		while(true) {
			int num = (int)(Math.random()*6) +1;
			System.out.println("(" + num + ")");
			
			if(num == 6) {
				break;
			}
			
			count++;
		}
		System.out.println("총 주사위 굴린 횟수는 : " + count + "입니다.");
			
			
		}
	}	