package main.multithreading.youtubelearn;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {
    private Queue<Integer> q;
    private int capacity;

    public BlockingQueue(int cap) {
        q = new LinkedList<>();
        this.capacity = cap;
    }

    public boolean add(int item) {
        synchronized (q) {
            while (q.size() == capacity) {
                try {
                    q.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            q.add(item);
            q.notifyAll();// Notify threads in wait state who are waiting for queue to have elements
            return true;
        }
    }

    public int remove() {
        synchronized (q) {
            while (q.size() == 0) {
                try {
                    q.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //do nothing
            int ele = q.poll();
            q.notifyAll();// So when an element is popped, it notifies thread to add items to queue
            return ele;
        }
    }
}
