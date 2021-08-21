package Structure.Queue;

import java.util.Iterator;

public class LinkedListQueue<E> implements IQueue<E> {

    private Node froNode;
    private Node bacNode;
    private int position;

    public LinkedListQueue() {
        this.froNode = null;
        this.bacNode = null;
        this.position = 0;
    }

    @Override
    public Iterator<E> iterator() {
        // TODO Auto-generated method stub
        return new LinkedListQueueIterator();
    }

    @Override
    public void enQueue(E data) {
        // TODO Auto-generated method stub
        Node newNode = new Node(data);
        if (froNode == null) 
        {
            froNode = bacNode = newNode;
        } else  
        {
            bacNode.next = newNode;
            bacNode = bacNode.next;
        }

        ++position;

    }

    @Override
    public E deQueue() {
        // TODO Auto-generated method stub
        if (isEmpty()) {
            throw new NullPointerException("Queue is Empty!");
        }

        E data = froNode.data;
        froNode = froNode.next;

        --position;
        
        return data;
    }

    @Override
    public E peek() {
        // TODO Auto-generated method stub
        return froNode.data;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return position == 0;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return position;
    }

    class LinkedListQueueIterator implements Iterator<E> {

        Node _froNode = froNode;
        int _position = position;

        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            return _position > 0;
        }

        @Override
        public E next() {
            // TODO Auto-generated method stub
            E value = _froNode.data;
            _froNode = _froNode.next;
            --_position;
        
            return value;
        }

    }
    

    class Node {
        E data;
        Node next;

        Node() {

        }

        Node(E data) {
            this.data = data;
            this.next = null;
        }
    }
}
