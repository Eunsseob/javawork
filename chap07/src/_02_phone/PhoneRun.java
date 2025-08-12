package _02_phone;

public class PhoneRun{
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("z플립", "검정");
		
		System.out.println("모델명 : " + sp.model);
	
		System.out.println("색상 : " + sp.color);
		
		sp.bell();
		sp.hangUp();
		sp.sendVoice("여보세요 누구십니까?");
		sp.receveVoice("나는 더 조은입니다. 좋은 하루 되세요");
		sp.hangOut();
		sp.search(sp.search("Java") + "를 검색합니다.");
	}
}
