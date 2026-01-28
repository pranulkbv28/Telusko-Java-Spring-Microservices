package Java.Threads;

class AThread extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi from A");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class BThread extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello from B");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ExtendingThread {
    public static void main(String[] args) {
        AThread obj1 = new AThread();
        BThread obj2 = new BThread();

        obj1.start();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj2.start();
    }
}
