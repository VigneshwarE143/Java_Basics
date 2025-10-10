package practiceCode;

public class threads extends Thread {
	public static void main(String[] args) {
		threads thread = new threads();
		thread.start();
		System.out.println("hi welcome");

	}

	public void run() {
		System.out.println("thread is running");
	}

}
