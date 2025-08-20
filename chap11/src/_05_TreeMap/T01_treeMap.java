package _05_TreeMap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class T01_treeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("apple", 10);
		treeMap.put("banana", 60);
		treeMap.put("zoo", 40);
		treeMap.put("ever", 10);
		treeMap.put("base", 20);
		treeMap.put("guess", 30);
		treeMap.put("cherry", 80);
		
		System.out.println("[c~f 사이의 단어 검색]");
		NavigableMap<String, Integer> rangeMap = treeMap.subMap("c", true, "f", true);
		for(Map.Entry<String, Integer> entry : rangeMap.entrySet()) {
			System.out.println(entry.getKey() + "-" + entry.getValue() + "페이지");
		}
	}

}
