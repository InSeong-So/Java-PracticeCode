package practiceCode.lambda;

public class MyFunctionalInterfaceTest {

	public static void main(String[] args) {
		MyFunctionalInterface fi;

		fi = () -> {
			String str = "method call 1";
			System.out.println(str);
		};
		fi.method();

		fi = () -> {
			System.out.println("method call 2");
		};
		fi.method();

		fi = () -> System.out.println("method call 3");
		fi.method();
	}
}
