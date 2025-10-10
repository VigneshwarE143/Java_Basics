package tasks;

public class StringBufferReader {


public static void main(String[] args) {
	long startTime,endTime;
	//builder
	startTime=System.nanoTime();
	StringBuilder s1=new StringBuilder ("hello");
	for(int i=0;i<10000;i++) {
	s1.append(" World");
	}
	endTime=System.nanoTime();
	System.out.println("StringBuilder Time : "+(endTime-startTime));
	
	//buffer
	startTime=System.nanoTime();
	StringBuffer s2 =new StringBuffer("hello");
	for(int i=0;i<10000;i++) {
	s2.append(" World");
	}
	endTime=System.nanoTime();
	System.out.println("StringBuffer Time :  "+(endTime-startTime));
	
	
}
}


