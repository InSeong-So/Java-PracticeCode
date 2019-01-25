package practiceCode.collection.mapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		// "홍길동" 키가 같으므로 제일 마지막에 저장한 값으로 대치
		map.put("홍길동", 85);
		map.put("김민수", 90);
		map.put("박민철", 80);
		map.put("정철수", 95);

		// 저장된 총 Entry 수 얻기
		System.out.println("총 Entry 수 : " + map.size());

		// 이름(키)으로 점수(값)를 검색
		System.out.println("\t홍길동 : " + map.get("홍길동"));
		System.out.println();

		// Key Set 얻기
		Set<String> keySet = map.keySet();

		// 반복해서 키를 얻고 값을 Map에서 얻어냄
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();

		// 키로 Map.Entry를 제거
		map.remove("홍길동");
		System.out.println("총 Entry 수 : " + map.size());

		// 객체를 하나씩 처리
		// Map.Entry Set 얻기
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

		// 반복해서 Map.Entry를 얻고 키와 값을 얻어냄
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();

		// 객체 전체 삭제
		// 모든 Map.Entry 삭제
		map.clear();
		System.out.println("총 Entry 수 : " + map.size());
	}
}
