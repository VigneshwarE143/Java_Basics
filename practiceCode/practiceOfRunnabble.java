package practiceCode;

public class practiceOfRunnabble implements Runnable {
	public static void main(String[] args) {
		practiceOfRunnabble obj = new practiceOfRunnabble();
		Thread thread = new Thread(obj);
		thread.start();
		System.out.println("hi....");

	}

	public void run() {
		System.out.println("thread is running");
		{

		}
	}
}
