package _03_hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class T03_SnackRun {

	public static void main(String[] args) {

		/*
		 * 키 = String
		 * 값 = Snack 객체
		 */
		
		HashMap<String, Snack> hm = new HashMap<>();
		
		hm.put("새우깡", new Snack("짠맛", 500));
		hm.put("포카칩", new Snack("짭잘한맛", 800));
		hm.put("수미칩", new Snack("어정쩡맛", 1500));
		hm.put("썬칩", new Snack("매운맛", 2000));
		hm.put("고구마깡", new Snack("단맛", 600));
		
		System.out.println(hm);
		
		// 1. put()
		hm.put("새우깡", new Snack("매운맛", 800));
		System.out.println(hm);

		// 2. get()
		Snack s = hm.get("다이제스트");
		System.out.println(s);
		
		// 3. size() : 객체의 갯수 반환
		System.out.println(hm.size());
		
		// 4. replace(K key, V value) : 해당 키를 찾아서 전달한 값으로 변경 만약 키가 없으면 아무것도 안함
		hm.replace("썬칩", new Snack("냐오오오",200));
		System.out.println(hm);
		
		Set keySet = hm.keySet();
		Iterator itKey = keySet.iterator();
		while(itKey.hasNext()) {
			String key = (String)itKey.next();
			Snack value = hm.get(key);
			System.out.println(key + "=" + value);
		}
	}

}
