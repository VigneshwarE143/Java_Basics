package practiceCode;

public class Encapsuluation {
	protected String name;
	protected int age;

	public Encapsuluation(String name, int age) {
		this.name = name;
		this.age = age;

	}

	void setAge(int age) {
		this.age = age;
	}

	void setName(String name) {
		this.name = name;
	}

	int getAge() {
		return age;

	}
 
	String getName() {
		return name;
	}

	public static void main(String[] args) {
		Encapsuluation obj = new Encapsuluation("Arun", 18);
		System.out.println(obj.getName() + "  " + obj.getAge());
		obj.setName("Vicky");
		obj.setAge(21);
		System.out.println(obj.getName() + "  " + obj.getAge());

	}
}
