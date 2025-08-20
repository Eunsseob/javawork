package _02_hashSet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class T04_HshSet {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		// 1 ~ 45 숫자 중 6개(중복 허용안됨)
		
		while(set.size() < 6) {
			int rand = (int)(Math.random()*45) + 1;
			set.add(rand);
		}
		
		System.out.println("총 객체의 수 : " + set.size());

		System.out.println(set);
		
		List list = new ArrayList(set);
		Collections.sort(list);
		
		System.out.println(list);
	}

}
