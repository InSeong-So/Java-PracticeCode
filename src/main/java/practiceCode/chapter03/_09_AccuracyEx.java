package practiceCode.chapter03;

public class _09_AccuracyEx {

	public static void main(String[] args) {
		Ex1();
		Ex2();
	}

	private static void Ex1() {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;

		double result = apple - number * pieceUnit;

		System.out.println("사과 한 개에서");
		System.out.println("0.7 조각을 빼면, ");
		System.out.println(result + "조각이 남는다.");
	}

	private static void Ex2() {
		int apple = 1;

		int totalPieces = apple * 10;
		int number = 7;
		int temp = totalPieces - number;

		double result = temp / 10.0;

		System.out.println("사과 한 개에서");
		System.out.println("0.7 조각을 빼면, ");
		System.out.println(result + "조각이 남는다.");
	}
}
