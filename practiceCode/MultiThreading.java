package practiceCode;

class L extends Thread{
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("\tfrom Thread i:" + i);
		}
		System.out.println("exit L");
	}
}

class M extends Thread{
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("\tfrom Thread j:" + i);
		}
		System.out.println("exit M");
	}
}

class N extends Thread{
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("\tfrom Thread k:" + i);
		}
		System.out.println("exit N");
	}
}

public class MultiThreading {
	public static void main(String[] args) {
	L thread1=new L();	
	M thread2=new M();
	N thread3=new N();
	thread3.setPriority(Thread.MAX_PRIORITY);
	thread2.setPriority(thread1.getPriority()+1);
	thread1.setPriority(Thread.MIN_PRIORITY);
	thread1.start();
	thread2.start();
	thread3.start();
	
	}
}
