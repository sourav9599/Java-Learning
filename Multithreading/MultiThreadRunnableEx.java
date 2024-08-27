package Multithreading;

public class MultiThreadRunnableEx implements Runnable{

    @Override
    public void run() {
        this.test1();
    }

    public synchronized void test1() {
        try {
            Thread.sleep(1000);
            System.out.println("test1");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void test2() {
        synchronized(this){
            System.out.println("test2");
        }
    }
    public void test3() {
        System.out.println("test3");
    }
}
