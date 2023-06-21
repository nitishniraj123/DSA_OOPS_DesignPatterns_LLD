package oops.multithreading;

public class EvenOddThread extends Thread{
    private static final int max_count = 10;
    private static  volatile int count=1;
    private final static Object lock = new Object();
    public static void main(String[] args) {
        Thread evenThread = new Thread(()->{
            while (count<=max_count){
                synchronized (lock){
                    if(count%2==0){
                        System.out.println(currentThread().getName() +" "+count);
                        count++;
                    }
                }
            }
        });
        Thread oddThread = new Thread(()->{
            while (count<=max_count) {
                synchronized (lock) {
                    if (count % 2 != 0) {
                        System.out.println(currentThread().getName() + " " + count);
                        count++;
                    }
                }
            }
        });
        evenThread.start();
        oddThread.start();
    }
}
