package practiceCode.chapter07._04;

public class SupersonicAirplane extends Airplane {

	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속으로 비행하겠습니다.");
		} else {
			// Airplane 객체의 fly() 메소드 호출
			super.fly();
		}
	}
}
