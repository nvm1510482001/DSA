package Structure.PriorityQueue;

import java.util.Arrays;

public class OrderArrayPriorityQueue<Key extends Comparable<Key>> implements PriorityQueueInterface<Key> {

    private Key[] pQueues;
    private int position;

    public OrderArrayPriorityQueue() {

    }

    public OrderArrayPriorityQueue(int capacity) {
        this.pQueues = (Key[]) new Object[capacity];
        this.position = 0;
    }


    @Override
    public void insert(Key k) {
        // TODO Auto-generated method stub
        pQueues[position++] = k;
        Arrays.sort(pQueues);
    }

    @Override
    public Key deleteMax() {
        // TODO Auto-generated method stub

        if (isEmpty()) {
            throw new NullPointerException("Priority Queue is Empty!");
        }

        return pQueues[--position];
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return position == 0;
    }

    @Override
    public Key max() {
        // TODO Auto-generated method stub

        if (isEmpty()) {
            throw new NullPointerException("Priority Queue is Empty!");
        }

        return pQueues[position - 1];
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return position;
    }
    
}
