package practiceCode.chapter06._03;

public class KoreanEx {
	public static void main(String[] args) {
		Korean k1 = new Korean("홍길동", "012345-6789101");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);

		Korean k2 = new Korean("홍길동", "000000-1111111");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
	}
}
