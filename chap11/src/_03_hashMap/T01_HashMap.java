package _03_hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map
 * 	- 키의 값의 쌍으로 이루어져 있다.
 * 	- 값을 얻어올 때 키값으로 얻어온다.
 * 	- Map 계을은 Collection을 구현한 클래스가 아님
 * 		: 넣을 때는 put() 사용
 */
public class T01_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> map = new HashMap<>();
		
		map.put("이무개", 1);
		map.put("이무개2", 2);
		map.put("이무개3", 3);
		map.put("이무개4", 4);
		map.put("이무개5", 5);
		
		System.out.println("총 entry 수 : " + map.size());
		
		System.out.println("이무개 : " + map.get("더조은1"));
		System.out.println(map);
		
		map.remove("이무개");
		System.out.println("총 entry 수 : " + map.size());
		
		Set<String> keySet = map.keySet();
		System.out.println(keySet);
		
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + ":" + value);
		}
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + ":" + value);
		}
	}

}
