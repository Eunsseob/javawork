package _04_enum;

public class Excercise9 {
	
	public static void main(String[] args) {
		Excercise ex1 = Excercise.getInstance();
		Excercise ex2 = Excercise.getInstance();
		
		System.out.println("ex1 == ex2 : " + (ex1 == ex2));
	}
}

class Excercise {
	private static Excercise asd = new Excercise();
	
	private Excercise() {
		System.out.println("객체생성");
	}
	
	static Excercise getInstance() {
		return asd;
	}
}
