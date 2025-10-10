package practiceCode;


class SharedResource {
    synchronized void printNumber(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread extends Thread {
    SharedResource resource;
    int number;

    public MyThread(SharedResource resource, int number) {
        this.resource = resource;
        this.number = number;
    }

    public void run() {
        resource.printNumber(number);
    }
}

public class ThreadInSharedMemory {
    public static void main(String[] args) {
    	SharedResource  resource = new SharedResource();

        MyThread t1 = new MyThread(resource, 5);
        MyThread t2 = new MyThread(resource, 10);

        t1.start();
        t2.start();
    }
}
