package Multithreading.thread;

public class Produce implements Runnable{
    SharedResource sharedResource;
    Produce(SharedResource sharedResource){
        this.sharedResource = sharedResource;
    }
    @Override
    public void run() {
        int i =0;
        while(i < 10){
            sharedResource.add();
            i++;
        }

    }
}
