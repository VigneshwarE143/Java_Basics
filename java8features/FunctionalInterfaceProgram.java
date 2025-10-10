package java8features;
@FunctionalInterface
interface printer{
	void print(String msg);
}
public class FunctionalInterfaceProgram {
public static void main(String[] args) {
	printer p=msg->System.out.println(msg);
	p.print("Hello from functional Interface");
}

}
