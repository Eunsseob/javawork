package _01_langPackage;

import java.util.Objects;

class Eunseob{
	String name;
	int age;
	
	Eunseob(String name, int age){
		this.name = name;
		this.age = age;
	}
		
	@Override
	public boolean equals(Object p) {
		Eunseob o = (Eunseob)p;
		return name.equals(o.name) && age == o.age;
	}
		
	@Override
	public int hashCode() {
		return Objects.hash(age); // value의 값 10으로 hashCode를 만듬
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age;
	}
	
}

public class Test {

	public static void main(String[] args) {
		Eunseob es = new Eunseob("손은섭", 27);
		Eunseob es1 = new Eunseob("아이", 27);
		
		System.out.println(es);
		System.out.println(es.equals(es1));
		System.out.println(es.hashCode());
		System.out.println(es1.hashCode());
		System.out.println("e1의 hashcode : " + es.hashCode());
		System.out.println("e2의 hashcode : " + es1.hashCode());
		
		System.out.println("-----------------------------");
		
		System.out.println(es == es1);
		
		System.out.println("e1의 고유한 hashcode : " + System.identityHashCode(es));
		System.out.println("e2의 고유한 hashcode : " + System.identityHashCode(es1));
		
		
		
		
	}

}
