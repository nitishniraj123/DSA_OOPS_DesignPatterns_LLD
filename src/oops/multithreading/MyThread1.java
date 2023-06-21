package oops.multithreading;

class MyThread2 extends Thread {
    private static int counter = 0;

    @Override
    public synchronized void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " Counter: " + counter);
            counter++;
        }
    }
}
public class MyThread1 {

    public static void main(String[] args) {
        MyThread2 myThread = new MyThread2();

        Thread thread1 = new Thread(myThread);
        Thread thread2 = new Thread(myThread);

        thread1.start();
        thread2.start();
    }
}
