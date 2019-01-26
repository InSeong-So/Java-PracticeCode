package practiceCode.collection.setTest;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));

		Integer score = null;

		// 제일 낮은 객체 리턴
		score = scores.first();
		System.out.println("가장 낮은 점수 : " + score);

		// 제일 높은 객체 리턴
		score = scores.last();
		System.out.println("가장 높은 점수 : " + score);

		// 주어진 객체보다 바로 아래 객체를 리턴
		score = scores.lower(new Integer(95));
		System.out.println("95점 미만 점수 : " + score);

		// 주어진 객체보다 바로 위 객체를 리턴
		score = scores.higher(new Integer(95));
		System.out.println("95점 초과 점수 : " + score);

		// 주어진 객체와 동등한 객체가 있으면 리턴, 없으면 바로 아래의 객체 리턴
		score = scores.floor(new Integer(95));
		System.out.println("95점과 같거나 바로 아래 점수 : " + score);

		// 주어진 객체와 동등한 객체가 있으면 리턴, 없으면 바로 위의 객체 리턴
		score = scores.ceiling(new Integer(85));
		System.out.println("85점과 같거나 바로 위 점수 : " + score + "\n");

		while (!scores.isEmpty()) {
			// 제일 낮은 객체를 꺼내오고 컬렉션에서 제거
			// 반대는 pollLast()가 있음
			score = scores.pollFirst();
			System.out.println(score + "(남은 객체 수 : " + scores.size() + ")");
		}
	}
}
