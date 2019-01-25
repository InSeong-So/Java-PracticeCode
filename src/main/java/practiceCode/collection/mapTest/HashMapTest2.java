package practiceCode.collection.mapTest;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest2 {

	public static class Student {
		public int sno;
		public String name;

		public Student(int sno, String name) {
			this.sno = sno;
			this.name = name;
		}

		@Override
		public int hashCode() {
			return sno + name.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Student) {
				Student student = (Student) obj;
				return (sno == student.sno) && (name.equals(student.name));
			} else {
				return false;
			}
		}

	}

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();

		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 95);

		System.out.println("총 Entry 수 : " + map.size());
	}
}
