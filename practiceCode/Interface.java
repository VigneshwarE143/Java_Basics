package practiceCode;

interface X {
	// abstract by default
	// abstract method= no body only method declaration
	void method1();
}

interface Y {
	void method2();

}

class Z implements X, Y {

	public void method1() {
		System.out.println("Hello1");
	}

	public void method2() {
		System.out.println("Hello2");
	}
}

public class Interface {
	public static void main(String[] args) {
		Z obj = new Z();
		obj.method1();
		obj.method2();
	}

}
