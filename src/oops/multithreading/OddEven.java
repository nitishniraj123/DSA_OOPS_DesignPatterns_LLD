package oops.multithreading;

public class OddEven{
    private static final int  maxCount = 20;
    private static volatile int counter = 1;
    private static final Object object = new Object();
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            while(counter<=maxCount){
                synchronized (object){
                    if(counter%2!=0){
                        System.out.println("t1 odd "+Thread.currentThread().getName() + " "+counter);
                        counter++;
                    }
                }
            }
        });


        Thread t2 = new Thread(()->{
            while(counter<=maxCount){
                synchronized (object){
                    if(counter%2==0){
                        System.out.println("t2 odd "+Thread.currentThread().getName() + " "+counter);
                        counter++;
                    }
                }
            }
        });
        t1.start();
        t2.start();
    }
}
