package practiceCode.chapter03;

public class _10_InfinityAndNaNCheckEx {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;

		double z = x / y;
		// double z = X % y;

		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));

		// 문제가 되는 코드
		System.out.println(z + 2);
	}
}
