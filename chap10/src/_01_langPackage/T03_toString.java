package _01_langPackage;
/*
 * Object의 toString()
 * 참조변수를 출력하면 toString()이 호출되고, 패키지명.클래스명@hashCode
 */
class Card{

	String kind;
	int num;
	
	Card(){
		this("heart",7);
	};

	Card(String kind, int num){
		this.kind = kind;
		this.num = num;
	}
	
	// to

}
public class T03_toString {

		public static void main(String[] args) {
		Card card1 = new Card();
		Card card2 = new Card("SPADE", 10);
		Card card3 = null;
		
		System.out.println(card1);
		System.out.println(card1.toString());
		System.out.println("-----------------------------------");
		System.out.println(card2);
		System.out.println(card2.toString());
		System.out.println("-----------------------------------");
		
		// 참조 변수의 값이 null 인 경우 null출력
		System.out.println(card3);
		//System.out.println(card3.toString()); // 주소값이 없어서 안뜨는거임
		
		
	}

}
