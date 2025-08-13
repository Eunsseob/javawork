package _Test_1;

public class product_main {
	public static void main(String[] args) {
		Tv p = new Tv();
		p.turn();
		p.voulmUp(60);
		p.voulmUp(15);
		p.voulmUp(20);
		p.voulmDown(20);
		p.voulmDown(60);
		p.voulmDown(30);
		System.out.println("채널 : " + p.channel(30));
		p.turn();
		product.AISpeak("ㅎㅇ 지니");
		System.out.println("-----------------------------------");
		
		Game p1 = new Game();
		String gameName = "레바의 모험";
		p1.search("코메디");
		p1.turn();
		p1.voulmUp(60);
		p1.voulmUp(15);
		p1.voulmUp(20);
		p1.voulmDown(20);
		p1.voulmDown(60);
		p1.voulmDown(30);
		p1.ChangeGame("피파");
		p1.turn();
		
	}
}
