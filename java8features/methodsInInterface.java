package java8features;

interface Q{

	default void method1() {
		System.out.println("Hello1");
	}

	static void method2() {
		System.out.println("Hello2");
	}
}

public class methodsInInterface implements Q{
	public static void main(String[] args) {
		methodsInInterface obj = new methodsInInterface();
		obj.method1();
		Q.method2();
	}

}