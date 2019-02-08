package practiceCode.chapter07._06;

public class ChildEx {

	public static void main(String[] args) {

		Child child = new Child();

		// 자동 타입 변환
		Parent parent = child;
		parent.method1();
		// 재정의된 메서드가 호출됨
		parent.method2();
		// parent.method3(); 호출 불가능
	}
}
