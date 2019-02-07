package practiceCode.chapter06._08;

public class CarEx {

	public static void main(String[] args) {
		Car car = new Car();

		car.setGas(5);

		boolean gasState = car.isLeftGas();
		if (gasState) {
			System.out.println("출발합니다.");
			car.run();
		}

		if (car.isLeftGas()) {
			System.out.println("gas가 충분합니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
	}
}
