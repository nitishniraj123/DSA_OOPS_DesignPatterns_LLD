package oops.multithreading;

public class EvenOddPrinter {
    private static final int MAX_VALUE = 10;
    private static volatile int counter = 1;
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread evenThread = new Thread(() -> {
            while (counter <= MAX_VALUE) {
                synchronized (lock) {
                    if (counter % 2 == 0) {
                        System.out.println(Thread.currentThread().getId());
                        System.out.println("Even Thread: " + counter);
                        counter++;
                    }
                }
            }
        });

        Thread oddThread = new Thread(() -> {
            while (counter <= MAX_VALUE) {
                synchronized (lock) {
                    if (counter % 2 != 0) {
                        System.out.println(Thread.currentThread().getId());
                        System.out.println("Odd Thread: " + counter);
                        counter++;
                    }
                }
            }
        });

        evenThread.start();
        oddThread.start();
    }
}

