package _03_hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class T02_HashMap {

	public static void main(String[] args) {
		/*
		 * HashMap 생성하여, 3개 넣기
		 * Map<String, String> // id pw
		 * 1. 사용자로 부터 id pw를 입력 받아서 
		 * - 해당하는 id가 없으면 '입력한 id는 없습니다.' 출력 후 다시 실행
		 * - pw가 맞지 않으면 : 'pw가 맞지 않습니다' 출력 후 다시실행
		 * - id와 pw가 맞으면 : '로그인이 되었습니다' 출력 후 종료
		 */

		Map<String, String> map = new HashMap<>();
		
		map.put("손은섭", "111");
		map.put("손은섭2", "222");
		map.put("손은섭3", "333");
		map.put("손은섭4", "444");
		map.put("손은섭5", "555");
		
		System.out.println(map.size());
		
		
		while(true) {
			Scanner sc = new Scanner(System.in);
		
			System.out.print("아이디를 입력하세요 >>>");
			String id = sc.next();
		
			Set<String> key = map.keySet();
			System.out.println(key);
		
			System.out.println(map.containsKey(id));
			
			if(!map.containsKey(id)) {
				System.out.println("해당하는 아이디가 없습니다");
				continue;
			}
		
			System.out.print("비밀번호를 입력하세요 >>>");
			String pw = sc.next();
		
			if(!map.get(id).equals(pw)) {
				System.out.println("pw가 맞지 않습니다");
				continue;
			}
			break;
		}
		System.out.println("로그인 완료");
	}

}
