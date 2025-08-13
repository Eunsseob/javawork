package _Test_1;

public class Tv implements product {

	boolean power;
	int volum = 0;
	
	@Override
	public boolean turn() {
		// TODO Auto-generated method stub

		power =! power;
		if(power == true) {
			System.out.println("전원을 킵니다");
		} else {
			System.out.println("전원을 끕니다.");
		}
		return power;
	}

	@Override
	public int voulmUp(int amount) {
		// TODO Auto-generated method stub

		volum += amount;
		System.out.printf("불륨을 킵니다 : %d\n", volum);
		return (int)volum;
	}

	@Override
	public int voulmDown(int amount) {
		volum -= amount;
		if(volum < 0) {
			System.out.println("불륨을 줄입니다 : 0");
			volum = 0;
			return volum;
		} else
			System.out.printf("불륨을 줄입니다 : %d\n", volum);
		return volum;
	}
	
	int channel(int channel) {
		return channel;
	}

}
