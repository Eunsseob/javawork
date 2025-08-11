package _11_staticEx;

public class Product_main {

	public static void main(String[] args) {
		Product p1 = new Product();
		for(int i=0; i<3; i++) {
			p1.Product();
		}
		p1.Count11();
		
		System.out.println("------------------");
		
		for(int i=0; i<2; i++) {
			p1.Product();
		}
		p1.Count11();
		
		for(int i=0; i<3; i++) {
			p1.txt();
		}
	}
}
