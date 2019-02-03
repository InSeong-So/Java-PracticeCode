package practiceCode.chapter02;

public class _05_LongEx {

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		// 컴파일 에러
		// long var3 = 100000000000;
		long var4 = 100000000000L;

		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}
}
