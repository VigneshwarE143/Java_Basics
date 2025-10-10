package polymorphism;

class A1{
	void sum(int a,int b) 
	{
		System.out.println(a+b);
	}
}
class B2 extends A1{
	void sum(int a,int b,int c) 
	{
		System.out.println(a+b+c);
	}
}
class C3 extends A1{
		void sum(double a,double b) 
		{
			System.out.println(a+b);
		}
}
		

public class overriding {
	public static void main(String[] args)
	{
		B2 obj=new B2();
		obj.sum(1,2,3);
		obj.sum(23,27);
		C3 obj2=new C3();
		obj2.sum(12,13);
		obj2.sum(11.01,2.3);
	}

}

