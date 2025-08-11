package _06_constructor;

public class TvRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv tv = new Tv("LG", "울트라 TV", 11);
		System.out.println("제조사 : " + tv.company);
		System.out.println("제조사 : " + tv.model);
		System.out.println("제조사 : " + tv.channel);
		
		System.out.println("--------------------------------");
		
		Tv tv2 = new Tv("삼성", "FULL HD", 23);
		System.out.println("제조사 : " + tv2.company);
		System.out.println("제조사 : " + tv2.model);
		System.out.println("제조사 : " + tv2.channel);
		
		System.out.println("--------------------------------");
		
		Tv2 tv21 = new Tv2("SONY", "HD TV", 5);
		System.out.println("제조사 : " + tv21.company);
		System.out.println("제조사 : " + tv21.model);
		System.out.println("제조사 : " + tv21.channel);
	}
}
