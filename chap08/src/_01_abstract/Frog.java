package _01_abstract;

public class Frog extends Pet {

	// 오버로딩으로 값을 넣어주는 형태
	
	Frog(){
		this("독개구리", "초록", "독이있음");
	}
	
	Frog(String kind, String color, String feature){
		super(kind, color, feature);
	}
	
	@Override
	void sound() {
		System.out.println("개굴~ 개굴~ 개굴~ 개굴~");
	}

	@Override
	void info() {
		System.out.println("특징 : " + getFeature());

	}

}
