package Structure.Stack;

import java.util.Iterator;

public class LinkedListStack<E> implements IStack<E> {

    private Node list;
    private int position;

    public LinkedListStack() {
        this.list = new Node();
        this.position = 0;
    }

    @Override
    public Iterator<E> iterator() {
        // TODO Auto-generated method stub
        return new IteratorLinkedListStack();
    }

    @Override
    public void push(E data) {
        // TODO Auto-generated method stub
        Node curNode = new Node(data);
        curNode.next = list;
        
        list = curNode;
        ++position;
    }

    @Override
    public E peek() {
        // TODO Auto-generated method stub

        if (isEmpty()) {
            throw new NullPointerException("Stack Is Empty!");
        }

        return list.data;
    }

    @Override
    public E pop() {
        // TODO Auto-generated method stub

        if (isEmpty()) {
            throw new NullPointerException("Stack Is Empty!");
        }

        E data = list.data;

        list = list.next;
        --position;

        return data;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return position == 0;
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

    class IteratorLinkedListStack implements Iterator<E> {

        private Node _list = list;
        private int _position = position;

        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            return _position > 0;
        }

        @Override
        public E next() {
            // TODO Auto-generated method stub
            E data  = _list.data;
            _list = _list.next;

            --_position;

            return data;
        }

    }
}
