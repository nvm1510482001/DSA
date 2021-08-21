package Structure.Stack;

import java.util.Iterator;

public class ArrayStack<E> implements IStack<E>{

    private E[] arrData;
    private int capacity;
    private int position = 0;
    private int sizeDefault = 100;

    public ArrayStack() {
        this.capacity = this.sizeDefault;
        arrData = (E[]) new Object[this.capacity];
    }

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        arrData = (E[]) new Object[this.capacity];
    }

    @Override
    public Iterator<E> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void push(E data) {
        // TODO Auto-generated method stub
        if (position >= this.capacity) {
            E[] arrCopy = (E[]) new Object[this.capacity * 2];
            for (int i = 0; i < capacity; i++) {
                arrCopy[i] = arrData[i];
            }

            arrData = arrCopy;
        }

        arrData[position++] = data;
    }

    @Override
    public E peek() {
        // TODO Auto-generated method stub
        if (isEmpty()) {
            throw new NullPointerException("Stack is Empty!");
        }

        return arrData[position - 1];
    }

    @Override
    public E pop() {
        // TODO Auto-generated method stub
        if (isEmpty()) {
            throw new NullPointerException("Stack is Empty!");
        }

        return arrData[--position];
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
    
    class ArrayStackIterator implements Iterator<E> {
        E[] _arrData = arrData;
        int _position = position;

        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            return position > 0;
        }
        @Override
        public E next() {
            // TODO Auto-generated method stub
            return _arrData[--_position];
        }
    }

}
