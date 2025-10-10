package java8features;
interface calculate{
	int operate(int a,int b);
}
public class Lamda {
public static void main(String[] args) {
	calculate add=(a,b)->a+b;
	System.out.println("sum :"+add.operate(3, 4));
}
}
