package _11_staticEx;

public class Product {

	// 제품번호
	String key;
	
	static int count;
	static int count2;
	
	public void Product() {
		++count;
		System.out.println("고유한 제품번호 (" + "더조은" + count + ")");
	}
	
	public void txt() {
		++count2; 
		System.out.println("제목 없음 " + count2);
	}
	
	public void Count11(){
		System.out.println("생산된 총 제품의 갯수 : "+ count);
	}
}
