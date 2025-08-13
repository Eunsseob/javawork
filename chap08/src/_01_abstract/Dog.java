package _01_abstract;

public class Dog extends Pet {

	// 오버로딩으로 값을 넣어주는 형태
	
	Dog(){
		this("말티즈", "갈색", "지랄견");
	}
	
	Dog(String kind, String color, String feature){
		super(kind, color, feature);
	}
	
	@Override
	void sound() {
		System.out.println("멍멍");
	}

	@Override
	void info() {
		System.out.println("종류 : " + super.getFeature());

	}

}
