package _02_SmartPhone;

public class PhoneRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone p = new SmartPhone();
		System.out.println(p);
		p.hangUp();
		p.hangOut();
		System.out.println("---------------------------");
		
		Phone p1 = new FolderPhone();
		System.out.println(p1);
		p1.hangUp();
		p1.hangOut();
	}

}
