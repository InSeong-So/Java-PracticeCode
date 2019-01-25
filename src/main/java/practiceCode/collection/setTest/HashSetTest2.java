package practiceCode.collection.setTest;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest2 {

	public static class Member {
		public String name;
		public int age;

		public Member(String name, int age) {
			this.name = name;
			this.age = age;
		}

		@Override
		public int hashCode() {

			// name과 age 값이 같으면 동일한 hashCode 리턴
			// String의 hashCode() 이용
			return name.hashCode() + age;
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Member) {
				Member member = (Member) obj;
				return member.name.equals(name) && (member.age == age);
			} else {
				return false;
			}
		}

	}

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();

		// 인스턴스는 다르지만 내부 데이터가 동일하므로 객체 1개만 저장
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));

		// 저장된 객체 수 얻기
		System.out.println("총 객체 수 : " + set.size());
	}
}
