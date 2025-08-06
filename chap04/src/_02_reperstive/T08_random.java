package _02_reperstive;

public class T08_random {

	public static void main(String args[]) {
		double rand1 = Math.random();
		System.out.println(rand1);
		System.out.println("-----------------");
		
		double rand2 = Math.random() * 10;
		System.out.println(rand2);
		System.out.println("------------");
		
		int intRand = (int)Math.random() * 10;
		System.out.println(intRand);
		System.out.println("---------------");
		
	}
}
