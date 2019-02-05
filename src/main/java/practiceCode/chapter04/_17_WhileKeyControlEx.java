package practiceCode.chapter04;

public class _17_WhileKeyControlEx {

	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;

		while (run) {
			// Enter 키가 입력되면 캐리지리턴(13)과 라인피드(10)가 입력되므로 이 값을 제외시킴
			if (keyCode != 13 && keyCode != 10) {
				System.out.println("--------------------------");
				System.out.println("1. 증속 | 2. 감속  | 3. 중지");
				System.out.println("--------------------------");
				System.out.println("선택 : ");
			}

			// 키보드의 키코드를 읽어옴
			keyCode = System.in.read();

			if (keyCode == 49) {
				speed++;
				System.out.println("현재 속도 = " + speed);
			} else if (keyCode == 50) {
				speed--;
				System.out.println("현재 속도 = " + speed);
			} else if (keyCode == 51) {
				run = false;
			}
		}

		System.out.println("프로그램 종료");
	}
}
