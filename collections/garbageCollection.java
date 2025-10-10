package collections;
import java.util.*;
public class garbageCollection {
	public void finalize() {
		System.out.println("garbage is removed");
	}
public static void main(String[] args) {
garbageCollection obj=new garbageCollection();
obj=null;
Runtime runtime = Runtime.getRuntime();
System.out.println("memory before gc"+runtime.freeMemory());
	System.gc();
System.out.println("memory after gc"+runtime.freeMemory());
}
}
