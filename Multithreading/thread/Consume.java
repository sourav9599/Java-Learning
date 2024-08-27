package Multithreading.thread;

public class Consume implements Runnable{
    SharedResource sharedResource;
    Consume(SharedResource sharedResource){
        this.sharedResource = sharedResource;
    }
    @Override
    public void run() {
        int i = 0;
        while(i < 10) {sharedResource.consume(); i++;}
    }
}
