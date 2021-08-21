package Structure.PriorityQueue;

public class UnorderArrayPriorityQueue<Key extends Comparable<Key>> implements PriorityQueueInterface<Key> {

    // [ 1, 3, 4, 6, 9, 0 , 15, 8, 20, 5 ,4 ]
    private Key[] pQueues;
    private int position;

    public UnorderArrayPriorityQueue() {

    }

    public UnorderArrayPriorityQueue(int capacity) {
        this.pQueues = (Key[]) new Object[capacity];
        this.position = 0;
    }

    @Override
    public void insert(Key k) {
        // TODO Auto-generated method stub
        pQueues[position++] = k;
    }

    @Override
    public Key deleteMax() {
        // TODO Auto-generated method stub

        // [ 1, 3, 4, 6, 9, 0 , 15, 8, 20, 5 ,4 ]
        // find index idMax of max element,
        // swap(idMax, position - 1)
        // return pQueues[--position] 

        if (isEmpty()) {
            throw new NullPointerException("Priority Queue is Empty!");
        }

        int idMax = 0;

        for (int  i = 0; i < position; i++) {
            if (pQueues[i].compareTo(pQueues[idMax]) > 0) {
                idMax = i;
            }
        }

        Key value = pQueues[idMax];
        pQueues[idMax] = pQueues[position - 1];
        pQueues[position - 1] = value;

        return pQueues[position - 1];
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

        int idMax = 0;

        for (int  i = 0; i < position; i++) {
            if (pQueues[i].compareTo(pQueues[idMax]) > 0) {
                idMax = i;
            }
        }

        return pQueues[idMax];
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return position;
    }
    
}
