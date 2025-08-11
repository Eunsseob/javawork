package _06_constructor;

class ThisConOver {
	int num;
	double dou;
	String name;
	
	ThisConOver(){
		this(1, 1.0, "홍길동");
		System.out.println("매개변수가 없는 생성자");
	}
	
	ThisConOver(int num){
		System.out.println("매개변수가 1개인 생성자(int)");
		this.num = num;
		dou = 1.0;
		name = "홍길동";
	}
	
	ThisConOver(String name){
		System.out.println("매개변수가 1개인 생성자(String)");
		num = 1;
		dou = 1.0;
		this.name = "홍길동";
	}
	
	ThisConOver(int num, double dou){
		this(num, dou, "홍길동");
		System.out.println("매개변수가 2개인 생성자)");
	}
	
	ThisConOver(int num, double dou, String name){
		System.out.println("매개변수가 3개인 생성자)");
		this.num = 1;
		this.dou = 1.0;
		this.name = "홍길동";
	}
	
	void info() {
		System.out.println("int : " + num);
		System.out.println("double : " + dou);
		System.out.println("name : " + name);
	}
}

public class ThisConOverloadingRun {

	public static void main(String[] args) {
		ThisConOver co = new ThisConOver();
		co.info();
		System.out.println("----------------");
		
		co = new ThisConOver(10);
		co.info();
		System.out.println("----------------");
		
		co = new ThisConOver("더조은");
		co.info();
	}
}
