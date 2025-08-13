package _01_abstract;

public class PetRun {

	public static void main(String[] args) {
		
		// 추상클래스는 객체를 생성할 수 없다
		// Pet pet1 = new Pet("1","12","123");
		
		Pet pet1 = new Frog("황소개구리", "갈색", "엉청 잘먹음");
		pet1.info();
		System.out.println(pet1);
		System.out.print("울음 소리 : ");
		pet1.sound();
		System.out.println("종류 : " + pet1.getKind());
		System.out.println("색상 : " + pet1.getColor());
		System.out.println("특징 : " + pet1.getFeature());
		System.out.println("--------------------------------");
		
		pet1 = new Dog();
		pet1.info();
		System.out.println(pet1);
		System.out.print("울음 소리 : ");
		pet1.sound();
		System.out.println("종류 : " + pet1.getKind());
		System.out.println("색상 : " + pet1.getColor());
		System.out.println("특징 : " + pet1.getFeature());
		System.out.println("--------------------------------");
		
		pet1 = new Cat("스코티시폴드", "회색", "눈이슬픔");
		pet1.info();
		System.out.println(pet1);
		System.out.print("울음 소리 : ");
		pet1.sound();
		System.out.println("종류 : " + pet1.getKind());
		System.out.println("색상 : " + pet1.getColor());
		System.out.println("특징 : " + pet1.getFeature());
		System.out.println("--------------------------------");
		

	}

}
