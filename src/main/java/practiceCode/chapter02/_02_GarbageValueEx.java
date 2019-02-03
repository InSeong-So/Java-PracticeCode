package practiceCode.chapter02;

public class _02_GarbageValueEx {

	public static void main(String[] args) {
		// 저장할 수 있는 값의 범위를 초과해서 값이 저장될 경우 엉터리 값이 변수에 저장되는데, 이러한 값을 쓰레기값이라고 한다.
		// 개발자는 쓰레기값이 생기지 않게 주의해야 한다.

		byte var1 = 125;
		int var2 = 125;
		for (int i = 0; i < 5; i++) {
			var1++;
			var2++;
			System.out.println("var1 : " + var1 + "\t" + "var2 : " + var2);
		}
	}
}
