package Structure.Queue;

import java.util.Iterator;

public class ArrayQueue<E> implements IQueue<E> {

    private E[] arrData;
    private int pBotId = 0, pTopId = 0;
    private int capacity = 0;
    private int sizeDefault = 100;
    private int size = 0;

    public ArrayQueue() {
        this.capacity = this.sizeDefault;
        arrData = (E[]) new Object[this.capacity];
    }

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        arrData = (E[]) new Object[this.capacity];
    }

    @Override
    public Iterator<E> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void enQueue(E data) {
        // TODO Auto-generated method stub
        if (size < capacity) {
            arrData[(pTopId + size) % capacity] = data;
            ++size;
        }
    }

    @Override
    public E deQueue() {
        // TODO Auto-generated method stub
        E data = arrData[pBotId++];
        --size;

        return data;
    }

    @Override
    public E peek() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
