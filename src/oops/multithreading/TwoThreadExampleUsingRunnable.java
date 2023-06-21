package oops.multithreading;

public class TwoThreadExampleUsingRunnable {

    public static void main(String[] args) {

        // Creating two threads
        Thread t1 = new Thread(new MyRunnable(), "Thread 1");
        //todo if we use t1.run it means it does not create new thread i.e Thread 1
        //t1.run();
        Thread t2 = new Thread(new MyRunnable(), "Thread 2");

        // Starting the threads
        t1.start();
        t2.start();
    }

    static class MyRunnable implements Runnable {
        public void run() {
            for(int i=1; i<=5; i++) {
                System.out.println(Thread.currentThread().getName() + " - " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

