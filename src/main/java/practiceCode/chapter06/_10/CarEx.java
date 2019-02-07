package practiceCode.chapter06._10;

public class CarEx {

	public static void main(String[] args) {
		Car car = new Car();
		car.keyTurnOn();
		car.run();
		int speed = car.getSpeed();
		System.out.println("현재 속도 : " + speed + "km/h");
	}
}
