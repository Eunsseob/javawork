package _10_PetEx;

public class Cat extends Pet {

	Cat(){
		super("페르시안", "흰색", "까칠보스");
	}
	
	String sound;
	
	String sound(String sound) {
		this.sound = sound;
		System.out.println(sound);
		return this.sound;
	}
	
//	@Override
//	public String toString() {
//		return "지랄묘";
//	}
}
