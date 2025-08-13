package _Test_1;

public interface product {
	static int volum = 0;
	
	public boolean turn();
	public int voulmUp(int amount);
	public int voulmDown(int amount);
	
	static void AISpeak(String AISpeak) {
		System.out.println(AISpeak);
	}
	
	// 오버라이딩을 할수 있고..
	default void search(String search) {
		System.out.println(search);
	}
}