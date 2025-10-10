package polymorphism;

abstract class A {

	// abstract method = no body
	abstract void method1();

	// non-abstract method = has a body
	void method2() {
		System.out.println("Hello2");
	}

}

class B extends A {
	void method1() {
		System.out.println("Hello1");
	}
}

public class AbstractMethod {
	public static void main(String[] args) {
		B obj = new B();
		obj.method1();
		obj.method2();
	}

}
