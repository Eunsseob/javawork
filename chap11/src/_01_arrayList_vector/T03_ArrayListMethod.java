package _01_arrayList_vector;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class T03_ArrayListMethod {

	public static void main(String[] args) {
		// List만들면서 값 바로 넣기
		List<Integer> list1 = new ArrayList<>(Arrays.asList(1,3,5));
		List<Integer> list2 = List.of(1,2,3);
		
		
		// for 문으로 넣기
		List<Integer> list = new ArrayList<>();
		for(int i = 100 ; i>50; i--) {
			list.add(i);
		}

		System.out.println(list);

		List<Integer> list3 = new ArrayList<>(list.subList(0, 4));
		System.out.println(list3);
		
		Collections.sort(list3);
		
		System.out.println(list3);
		
		Collections.reverse(list3);
		System.out.println("내림차순 정렬 : " + list3);
		
		System.out.println(list.containsAll(list3));
		
		System.out.println("==========================");
		
		List<String> slist = new ArrayList<>();
		
		slist.add("B");
		slist.add("C");
		//slist.add(3, "A"); // 오류
		
		slist.add("A");
		
		List<String> slist2 = new ArrayList<>();
		
		slist2.add("A");
		slist2.add("B");
		slist2.add("F");
		slist2.add("Z");
		System.out.println(slist);

		System.out.println("slist3에서 slist2와 겹치는 부분만 남기고 삭제 " + list2.containsAll(list3));
	}

}
