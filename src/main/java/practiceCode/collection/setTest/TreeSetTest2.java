package practiceCode.collection.setTest;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetTest2 {

	public static void main(String[] args) {

		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));

		// 내림차순으로 정렬된 NavigableSet를 반환
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		for (Integer score : descendingSet) {
			System.out.println(score + " ");
		}
		System.out.println();

		// 내림차순으로 정렬된 NavigableSet을 다시 내림차순(=오름차순)
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		for (Integer score : ascendingSet) {
			System.out.println(score + " ");
		}
	}
}
