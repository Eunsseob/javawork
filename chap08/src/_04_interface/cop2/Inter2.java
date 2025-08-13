package _04_interface.cop2;

/*
 * interface : 일종의 추상클래스인데 추상클래스보다 추상화 더 높다
 * 				추상메소드만 포함(일반 메소드 없음)
 * 				추상메소드와 상수만 멤버로 가질수 있음(변수 사용못함)
 * 				객체생성 할 수 없음
 * - 사용 : 표준 인터페이스를 만들어 어떠한 객체가 들어오더라도 호출시 이름 동일하게 호출
 */
public interface Inter2 {
// 상수만 사용
	int add(int x);
	int add(int x, int y);
}
