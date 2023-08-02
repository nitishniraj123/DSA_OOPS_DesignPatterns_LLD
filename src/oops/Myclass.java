package oops;

public class Myclass extends Thread {

    public static void main(String[] args) {

        Myclass t1 = new Myclass();
        Myclass t2 = new Myclass();
        Myclass t3 = new Myclass();
        Myclass t4 = new Myclass();

        int count =1,n=20;
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        while (count<=n) {
            if(count%4 == 1)
                System.out.println("--------------------------------------");

            if (count % 4 == 1) {
                t1.run();
                t2.suspend();
                t3.suspend();
                t4.suspend();
                //System.out.println(Thread.currentThread().getId());
                System.out.println(" counter is  "+count + " :-printed by thead 1" + t1.getId());
            }

            if (count % 4 == 2) {
                t2.run();
                t1.suspend();
                t3.suspend();
                t4.suspend();
                System.out.println(" counter is  "+count + " :-printed by thread 4" + t2.getId());
            }
            if (count % 4 == 3) {
                t3.run();
                t1.suspend();
                t2.suspend();
                t4.suspend();
                System.out.println(" counter is  "+count + " :-printed by thread 3" + t3.getId());
            }

            if (count % 4 == 0) {
                t4.run();
                t2.suspend();
                t3.suspend();
                t1.suspend();
                System.out.println(" counter is  "+count + " :-printed by tread 4" + t4.getId());
            }
            count++;
        }

    }
}
