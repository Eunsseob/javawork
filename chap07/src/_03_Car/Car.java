package _03_Car;

public class Car {

	String model;
	String company;
	boolean power;
	static int speed;
	int speed2; 
	
	Car(String model, String company){
		this.model = model;
		this.company = company;
	}
	
	void stop(boolean power) {
		System.out.println("시동을 끕니다. 현재 상태 : " + power);
	}
	void start(boolean power) {
		speed2 = 0;
		System.out.println("시동을 겁니다. 현재 상태 : " + power);
	}
	
	void speedUp(int speed) {
		speed2 += speed;
		System.out.println("속도를 올립니다. 현재 속도 : " + (speed2));
	}
	
	void speedDown(int speed) {
		speed2 -= speed;
		System.out.println("속도를 내립니다. 현재 속도 : " + (speed2));
	}
}
