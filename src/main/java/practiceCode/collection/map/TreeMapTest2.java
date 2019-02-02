package practiceCode.collection.map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest2 {

	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(new Integer(87), "홍길동");
		scores.put(new Integer(98), "김민수");
		scores.put(new Integer(75), "박민철");
		scores.put(new Integer(95), "정현수");
		scores.put(new Integer(80), "박철수");
		scores.put(new Integer(84), "이만덕");

		NavigableMap<Integer, String> descendingMap = scores.descendingMap();
		Set<Map.Entry<Integer, String>> descendingEntrySet = descendingMap.entrySet();
		for (Map.Entry<Integer, String> entry : descendingEntrySet) {
			System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
		}
		System.out.println();

		NavigableMap<Integer, String> ascendingMap = descendingMap.descendingMap();
		Set<Map.Entry<Integer, String>> ascendingEntrySet = ascendingMap.entrySet();
		for (Map.Entry<Integer, String> entry : ascendingEntrySet) {
			System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
		}
	}
}
