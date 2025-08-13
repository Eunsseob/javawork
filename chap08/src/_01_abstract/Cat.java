package _01_abstract;

public class Cat extends Pet {

	// 오버로딩으로 값을 넣어주는 형태
	
	Cat(){
		this("페르시안", "흰색", "지랄묘");
	}
	
	Cat(String kind, String color, String feature){
		super(kind, color, feature);
	}
	
	@Override
	void sound() {
		System.out.println("야옹");
	}

	@Override
	void info() {
		// TODO Auto-generated method stub

	}

}
