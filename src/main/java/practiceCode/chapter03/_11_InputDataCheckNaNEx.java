package practiceCode.chapter03;

public class _11_InputDataCheckNaNEx {

	public static void main(String[] args) {
		Ex1();
		Ex2();
	}

	private static void Ex1() {
		// 사용자로부터 입력받은 값
		String userInput = "NaN";
		// 입력값을 double 타입으로 변환
		double val = Double.valueOf(userInput);

		double currentBalance = 10000.0;

		// currentBalance에 NaN이 저장됨
		currentBalance += val;
		System.out.println(currentBalance);
	}

	private static void Ex2() {
		// 사용자로부터 입력받은 값
		String userInput = "NaN";
		// 입력값을 double 타입으로 변환
		double val = Double.valueOf(userInput);

		double currentBalance = 10000.0;

		if (Double.isNaN(val)) {
			System.out.println("NaN이 입력되어 처리할 수 없음");
			val = 0.0;
		}

		// currentBalance에 NaN이 저장됨
		currentBalance += val;
		System.out.println(currentBalance);
	}
}
