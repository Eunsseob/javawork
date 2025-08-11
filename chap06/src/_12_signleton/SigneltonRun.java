package _12_signleton;

class signelton{
	// private 으로 외부에서 접근하지 못하도록 막음.
	private static signelton s = new signelton();
	
	// 객체를 생성하지 못하도록 막아 놓음.
	private signelton(){
		System.out.println("객체 생성");
	}
	
	// getter 메서드, static이 안붙은 인스턴스 메소드 사용못함(객체를 생성할 수 없기 때문)
	static signelton getsignelton() {
		return s;
	}
}

// 싱글톤 : 전체 프로그램에서 단 하나의 객체만 만들도록 보장하는 기법
// - 사용하는 이유 : 최초로 만들어진 객체를 재활용 하는 패턴
// 생성자를 통해 여러번 호출이 되더라도 객체는 새로 생성하지 않음
// - 장점 : 메모리 낭비 방지
// - 단점 : 의존성이 높아진다. private 생성자를 이용하기 때문에 상속이 어렵다. 테스트하기 힘들다

public class SigneltonRun {

	public static void main(String[] args) {
		signelton s1 = signelton.getsignelton();
		System.out.println(s1);
		
		signelton s2 = signelton.getsignelton();
		System.out.println(s2);
	}

}
