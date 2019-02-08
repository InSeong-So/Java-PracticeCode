package practiceCode.chapter07._06;

class A {
}

class B extends A {
}

class C extends A {
}

class D extends B {
}

class E extends C {
}

public class PromotionEx {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();

		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;

		B b1 = d;
		C c1 = e;
		// 컴파일 에러(상속 관계에 있지 않음)
		// B b3 = e;
		// C c2 = d;
	}
}