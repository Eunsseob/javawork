package _01_abstract;
/*
 * 추상 클래스 : 클래스 앞에 abstract 키워드를 사용
 * 			  추상 메서드가 1개이상 포함되어 있으면, 반드시 추상 클래스로 만들어줘야함.
 * - 추상메서드 : 메서드에 선언부만 있으며, 내용(프로그램)이 없는 메소드
 * 				ex) void 반환부가 없는 메서드(매개변수); // 추상 메서드 앞에 abstract를 붙임
 * 					-> abstract void 메서드명(매개변수);
 * > 추상 클래스는 객체를 생성할 수 없다(그래서 상속 받아서 사용)
 */
abstract public class Pet {
	private String kind;
	private String color;
	private String feature;
	
	Pet(String kind, String color, String feature){
		this.kind = kind;
		this.color = color;
		this.feature = feature;
	}
	
	// 추상메서드 : 상속받는 곳에서 반드시 구현해야함.
	abstract void sound();
	abstract void info();
	
	String getKind() {
		return kind;
	}
	
	String getColor() {
		return color;
	}
	
	String getFeature() {
		return feature;
	}
	
	@Override
	public String toString() {
		return "종류 : " + kind + ", 색상은 : " + color + ", 특징은 : " + feature;
	}
}