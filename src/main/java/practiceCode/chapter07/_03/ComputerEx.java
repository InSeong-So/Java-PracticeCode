package practiceCode.chapter07._03;

public class ComputerEx {

	public static void main(String[] args) {

		int r = 10;

		Calculator calc = new Calculator();
		System.out.println("원 면적 : " + calc.areaCircle(r));
		System.out.println();

		// 재정의 메소드 호출
		Computer com = new Computer();
		System.out.println("원 면적 : " + com.areaCircle(r));
	}
}
