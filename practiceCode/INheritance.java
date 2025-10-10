package practiceCode;

class Hello {
	void bark() {
		System.out.println("bark");
	}

}

class puppy extends Hello {
	void bark2() {
		System.out.println("barkyyyyy");
	}
}

class INheritance {
	public static void main(String[] args) {

		puppy obj = new puppy();
		obj.bark();
		obj.bark2();
	}
}

/// method  overloading with inheritance
//class Hello{
//	void bark();
//
//}
//class puppy extends Hello{
// void bark() {
//	System.out.println("barkyyyyy");
//}}
//class INheritance{
//	public static void main(String[] args) {
//		
//	
//	 puppy obj=new puppy();
//	obj.bark();
//	
//	}}
