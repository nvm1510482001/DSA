package Structure.Stack;

public interface IStack<E> extends Iterable<E> {
    void push(E data);
    E peek();
    E pop();
    int size();
    boolean isEmpty();
}