package _02_SmartPhone;

public class FolderPhone extends Phone {

	FolderPhone(){
		this("이수만");
	}
	
	FolderPhone(String owner){
		super(owner);
	}
	
	@Override
	void hangUp() {
		// TODO Auto-generated method stub

		System.out.println("난 폴더폰 전화 받았슴~~~~~~");
	}

	@Override
	void hangOut() {
		// TODO Auto-generated method stub
		System.out.println("난 폴더폰 전화 끊음~~~~~~");

	}

}
