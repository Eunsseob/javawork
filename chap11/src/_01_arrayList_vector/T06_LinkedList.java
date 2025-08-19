package _01_arrayList_vector;

import java.util.LinkedList;
import java.util.List;

/*
 * LinkedList
 * - 배열의 단점을 보완하여 나옴
 * - 연속적으로 붙어있지 않고, 다음 데이터를 연결하는 참조 주소를 가지고 잇음
 */
public class T06_LinkedList {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		
		list.add(10); // 맨끝에 추가
		list.add(0, 1); // index 0 번에 추가
		list.addFirst(2); // 맨앞에 추가
		list.addLast(20); // 맨끝에 추가
		list.add(50); // 맨끝에 추가
		
		System.out.println(list);
		
		for(int i=0; i<list.size(); i++) {
			list.get(i);
		}
		
		list.remove(1);
		System.out.println(list);
		
		// list.remove();
		
	}

}
