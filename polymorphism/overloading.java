package polymorphism;

public class overloading {
int  add(int a,int b) {
	return a+b;
}
int  add(int a,int b,int c) {
	return a+b+c;
}

double  add(double a,double b) {
	return a+b;
}

String  add(String a,String b) {
	return a+" "+b;
}
public static void main(String[] args) {
	overloading obj=new overloading();
	System.out.println(obj.add(11,12));
	System.out.println(obj.add(12.23,13.22));
	System.out.println(obj.add(11,21,13));
	System.out.println(obj.add("hello","worls!"));
}
}
