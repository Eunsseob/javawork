package _03_Car;

public class CarRun {

	public static void main(String[] args) {
		AmbulanceCar ambulcar = new AmbulanceCar("앰뷸런스 차", "KIA");
		
		System.out.println("모델명 : " + ambulcar.model);
		
		System.out.println("모델명 : " + ambulcar.company);
		
		int speed2 = 0;
		
		
		ambulcar.start(true);
		
		ambulcar.siren("사이렌을 울립니다.");
		ambulcar.speedUp(50);
		ambulcar.speedDown(30);
		ambulcar.speedDown(20);
		
		ambulcar.stop(false);
		ambulcar.firstAid("응급처치 중입니다.");
		
	}
}
