package _02_SmartPhone;

public class SmartPhone extends Phone {

	SmartPhone(){
		this("이재용");
	}
	
	SmartPhone(String owner){
		super(owner);
	}
	
	@Override
	void hangUp() {
		// TODO Auto-generated method stub
		System.out.println("난 스마트폰 전화 받음~~~~~~");

	}

	@Override
	void hangOut() {
		// TODO Auto-generated method stub

		System.out.println("난 스마트폰 전화 끊음~~~~~~");
	}

}
