package oops.multithreading;

public class MyThread extends Thread {

    private int id;

    public MyThread(int id) {
        this.id = id;
    }

    public void run() {
        System.out.println("Thread " + id + " started.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread " + id + " finished.");
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread(1);
        MyThread t2 = new MyThread(2);
        MyThread t3 = new MyThread(3);
        MyThread t4 = new MyThread(4);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t3.start();
        t4.start();
        String s = "gshdh";
        System.out.println(s);
        s="hggg";
        System.out.println(s);
    }

}

