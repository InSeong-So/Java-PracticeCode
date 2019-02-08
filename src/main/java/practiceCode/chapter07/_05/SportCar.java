package practiceCode.chapter07._05;

public class SportCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;
	}

	// 오버라이딩을 할 수 없음
	// public void stop() {
	// System.out.println("스포츠카를 멈춥니다.");
	// speed = 0;
	// }
}
