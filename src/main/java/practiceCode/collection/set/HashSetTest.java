package practiceCode.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		// "Java"는 한번만 저장
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");

		// 저장된 객체 수 얻기
		int size = set.size();
		System.out.println("총 객체 수 : " + size);

		// 반복자 얻기
		Iterator<String> iterator = set.iterator();
		// 객체 수만큼 루핑
		while (iterator.hasNext()) {
			// 한개의 객체를 가져옴
			String element = iterator.next();
			System.out.println("\t" + element);
		}

		// 한 개의 객체 삭제
		set.remove("JDBC");
		set.remove("iBATIS");

		System.out.println("총 객체수 : " + set.size());

		iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}

		// 모든 객체를 제거하고 비움
		set.clear();
		if (set.isEmpty()) {
			System.out.println("비어 있음");
		}
	}
}
