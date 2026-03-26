class MyThread extends Thread {

    public void run() {
        System.out.println("Child thread is running");
    }
}

public class SimpleThread {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main thread started");

        MyThread t = new MyThread();

        t.start();   // start child thread
        t.join();    // main thread waits for child thread

        System.out.println("Main thread ended");
    }
}
