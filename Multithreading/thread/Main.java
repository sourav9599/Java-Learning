package Multithreading.thread;

public class Main {
    public static void main(String[] args){
        // Producer - Consumer Problem
        SharedResource sharedResource = new SharedResource( 4);
        Produce produce = new Produce(sharedResource);
        Consume consume = new Consume(sharedResource);
        Thread t1 = new Thread(produce);
        Thread t2 = new Thread(consume);
        t1.start();
        t2.start();
    }
}
