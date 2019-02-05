package practiceCode.chapter04;

import java.util.Scanner;

public class _18_DoWhileEx {

	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");

		Scanner sc = new Scanner(System.in);
		String inputString;

		do {
			System.out.println(">");
			inputString = sc.nextLine();
			System.out.println(inputString);
		} while (!inputString.equals("q"));

		System.out.println();
		System.out.println("프로그램 종료");
	}
}
