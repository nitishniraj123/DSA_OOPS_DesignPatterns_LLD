package oops.multithreading;

public class OddEvenUsingRunnable {
    private static final int  maxCount = 20;
    private static volatile int counter = 1;

    public void printEven() throws InterruptedException {
        synchronized (this){
            while (counter<=maxCount){
                if(counter%2==0){
                    wait();
                    System.out.println("t1 odd "+Thread.currentThread().getName() + " "+counter);
                    counter++;
                }
                counter++;
                notify();
            }
        }
    }

    public void printOdd() throws InterruptedException {
        synchronized (this){
            while (counter<=maxCount){
                if(counter%2!=0){
                    wait();
                    System.out.println("t1 odd "+Thread.currentThread().getName() + " "+counter);
                    counter++;
                }
                counter++;
                notify();
            }
        }
    }
    public static void main(String[] args) {

        OddEvenUsingRunnable oddEvenUsingRunnable = new OddEvenUsingRunnable();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    oddEvenUsingRunnable.printOdd();
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    oddEvenUsingRunnable.printEven();
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        });

    }
}
