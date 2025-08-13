package _06_interfaceDefault;

public class InterClass2 implements Inter {

	@Override
	public int method1() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int method2() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int method() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String deMe() {
		return "오버라이딩한 메서드";
	}
	
	@Override
	public String me() {
		return "오버라이딩한 메소드 me()";
	}

}
