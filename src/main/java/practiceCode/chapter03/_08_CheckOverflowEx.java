package practiceCode.chapter03;

public class _08_CheckOverflowEx {

	public static void main(String[] args) {
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음");
		}
	}

	private static int safeAdd(int left, int right) {
		if (right > 0) {
			if (left > (Integer.MAX_VALUE - right)) {
				// 예외 발생 코드
				throw new ArithmeticException("오버플로우 발생");
			}
			// right <= 0일 경우
		} else {
			if (left < (Integer.MIN_VALUE - right)) {
				// 예외 발생 코드
				throw new ArithmeticException("오버플로우 발생");
			}
		}
		return left + right;
	}
}
