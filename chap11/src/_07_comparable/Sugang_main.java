package _07_comparable;

import java.util.TreeSet;

public class Sugang_main {

	public static void main(String[] args) {
		TreeSet<sugang> s1 = new TreeSet<>();
		TreeSet<revsugangcost> s2 = new TreeSet<>();
		
		s1.add(new sugang("컴퓨터 구조", 5000));
		s1.add(new sugang("알고리즘", 7000));
		s1.add(new sugang("컴퓨터 네트워크", 3000));
		
		s2.add(new revsugangcost("컴퓨터 구조", 5000));
		s2.add(new revsugangcost("알고리즘", 7000));
		s2.add(new revsugangcost("컴퓨터 네트워크", 3000));
		
		System.out.println(s1);
		System.out.println(s2);

	}

}
