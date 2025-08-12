package _10_PetEx;

public class PetRun {
	public static void main(String[] args) {
		// Cat ca = new Cat("페르시안","검정색","지랄묘");
		Cat ca = new Cat();
		Owner p = new Owner(); 
		
		p.info(new Cat());
		ca.sound("냐오오옹");
		p.info(new Dog());
		ca.sound("월왕ㄹ왈왈");
		p.info(new Frog());
		ca.sound("구물ㄲ무꾸묶물꿈꾸루");
	}
}
