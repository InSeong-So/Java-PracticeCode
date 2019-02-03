package practiceCode.chapter03;

public class _14_StringEqualsEx {

	public static void main(String[] args) {
		String strVar1 = "김민수";
		String strVar2 = "김민수";
		String strVar3 = new String("김민수");

		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		System.out.println();
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));

	}
}
