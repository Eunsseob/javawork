package _02_hashSet;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Member{
	String name;
	int age;
	Member(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Member) {
//			Member member = (Member)o;
//			return name.equals(member.name) && member.age == age;
			
			return name.equals(((Member)o).name) && age == ((Member)o).age;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
 	}
	
	@Override
	public String toString() {
		return name + "/" + age;
	}
	// Object equals => 값이 같은가? 로 오버라이딩
	// hashCode -> 값이 같으면 같은 해시코드가 나오게 오버라이딩
	// 참조 변수를 출력하면 이름/나이
}
public class T03_HashSet {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		
		set.add(new Member("홍길동", 123));
		set.add(new Member("더조은", 123));
		set.add(new Member("홍길동", 123));
		set.add(new Member("더조은", 234));
		set.add(new Member("더조은", 50));
		set.add(new Member("더조은", 60));
		
		System.out.println("총 객체 수 : " + set.size());

		System.out.println(set.equals(set));
		
		System.out.println(set);
	}
}
