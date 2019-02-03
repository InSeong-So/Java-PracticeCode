package practiceCode.chapter03;

public class _12_StringConcatEx {

	public static void main(String[] args) {
		String str1 = "JDK" + 8.0;
		String str2 = str1 + " 특징";
		System.out.println(str2);

		String str3 = "JDK" + 8 + 8.0;
		String str4 = 8 + 8.0 + "JDK";
		System.out.println(str3);
		System.out.println(str4);
	}
}
