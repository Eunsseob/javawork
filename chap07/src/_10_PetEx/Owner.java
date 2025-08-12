package _10_PetEx;

public class Owner {
	
	String sound;
	String kind;
	String color;
	String feature;
	
//	void info(Cat cat) {
//		System.out.println();
//	}
	
	void info(Pet p) {
		System.out.println(p.kind + "종류이면서" + "\n"
				+ p.color + "색상이고요" + "\n"
				+ p.feature + "이런 특징을 가지고 있어요");
	}
	
	void sound(Pet p) {
		System.out.println("냐옹~~");
	}
	
	public String getKind() {
		return kind;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getFeature() {
		return feature;
	}
	
//	void info(Pet p) {
//		System.out.println(p + "종류입니다");
//	}
	
	@Override
	public String toString() {
		return "비글";
	}
}
