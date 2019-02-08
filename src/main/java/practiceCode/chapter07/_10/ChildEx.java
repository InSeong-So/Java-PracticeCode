package practiceCode.chapter07._10;

public class ChildEx {

	public static void main(String[] args) {

		// 자동 타입 변환
		Parent parent = new Child();
		parent.field = "data";
		parent.method1();
		parent.method2();

		/* 불가능
		 * parent.field2 = "data2";
		 * parent.method3();
		 */

		Child child = (Child) parent;
		child.field2 = "yyy";	// 가능
		child.method3();		// 가능
	}
}
