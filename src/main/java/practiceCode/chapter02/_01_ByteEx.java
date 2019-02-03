package practiceCode.chapter02;

public class _01_ByteEx {

	public static void main(String[] args) {
		// byte는 -128(최솟값)부터 127(최댓값)을 넘으면 다시 -128부터 시작하게 된다.
		// 다른 정수 타입도 자신의 최솟값-최댓값을 초과하면 이와 같은 방식으로 처리된다.

		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		// 컴파일 에러 항목
		// byte var6 = 128;

		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
	}
}
