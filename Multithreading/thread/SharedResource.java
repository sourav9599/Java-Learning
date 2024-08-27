package Multithreading.thread;

import java.util.ArrayDeque;
import java.util.Queue;

public class SharedResource {
    Queue<Integer> queue;
    int size;

    SharedResource( int size){
        this.queue = new ArrayDeque<>();
        this.size = size;

    }

    public synchronized void add(){
        if(this.queue.size() == size) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.queue.add(10*this.size);
        System.out.println("Added: " + this.queue);
        notify();
    }
    public synchronized void consume(){
        while (this.queue.isEmpty()){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        int pop = this.queue.remove();
        System.out.println("Consumed : "+this.queue);
        notify();
        

    }
}
