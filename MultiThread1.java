class MyThread extends Thread {

    public void run() {
        System.out.println("Running: " + getName());
    }
}

public class MultiThread1 {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main thread started");

        for (int i = 1; i <= 3; i++) {

            MyThread t = new MyThread();
            t.start();   // start thread
            t.join();    // wait for thread to finish
        }

        System.out.println("Main thread ended");
    }
}
