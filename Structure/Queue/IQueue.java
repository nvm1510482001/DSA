package Structure.Queue;

public interface IQueue<E> extends Iterable<E> {
    void enQueue(E data);
    E deQueue();
    E peek();
    boolean isEmpty();
    int size();
}
