package practiceCode.chapter03;

public class _07_OverflowEx {

	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z);

		// 해결

		long x1 = 1000000;
		long y1 = 1000000;
		long z1 = x1 * y1;
		System.out.println(z1);
	}
}
