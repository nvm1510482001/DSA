package Structure.Heap;

public interface HeapInterface<Key extends Comparable<Key>> {
    void insert(Key key);
    Key deleteMax();
    Key max();
    int size();
    boolean isEmpty();
}
