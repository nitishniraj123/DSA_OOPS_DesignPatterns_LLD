package oops;

public class CustomReadWriteLock {

    private int readers;
    private int writers;
    private int writeRequests;

    public synchronized void lockRead() throws InterruptedException {
        while (writers > 0 || writeRequests > 0) {
            wait();
        }
        readers++;
    }

    public synchronized void unlockRead() {
        readers--;
        notifyAll();
    }

    public synchronized void lockWrite() throws InterruptedException {
        writeRequests++;
        while (readers > 0 || writers > 0) {
            wait();
        }
        writeRequests--;
        writers++;
    }

    public synchronized void unlockWrite() {
        writers--;
        notifyAll();
    }

    public static void main(String[] args) {
        CustomReadWriteLock customReadWriteLock = new CustomReadWriteLock();
        customReadWriteLock.readers=3;
        customReadWriteLock.writeRequests=3;
        customReadWriteLock.writers=3;
        try {
            customReadWriteLock.lockRead();
        }catch (Exception e){
            System.out.println(e);
        }
        int[] a= new int[]{6,80,9};
    }
}

