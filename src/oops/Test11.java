package oops;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class Test11 {
    private static  final  int maxCount= 10;
    private static volatile int counter = 1;
    private static final Object object = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(()->{
            while (counter<=maxCount){
                synchronized (object){
                    if(counter%3 == 1){
                        System.out.println("thread 1 "+Thread.currentThread().getName() + " "+counter);
                        counter++;
                    }
                }
            }
        });

        Thread t2 = new Thread(()->{
            while (counter<=maxCount){
                synchronized (object){
                    if(counter%3 == 2){
                        System.out.println("thread 2 "+Thread.currentThread().getName() + " "+counter);
                        counter++;
                    }
                }
            }
        });

        Thread t3 = new Thread(()->{
            while (counter<=maxCount){
                synchronized (object){
                    if(counter%3 == 0){
                        System.out.println("thread 3 "+Thread.currentThread().getName() + " "+counter);
                        counter++;
                    }
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();

    }
}
