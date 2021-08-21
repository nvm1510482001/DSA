package Structure.PriorityQueue;

public interface PriorityQueueInterface<Key extends Comparable<Key>> {
    // Hàng đợi ưu tiên, index of priority 

    // insert function (data, index)
    // So sánh data lớn hơn thì ưu tiên lớn hơn

    void insert(Key k);
    Key deleteMax();
    boolean isEmpty();
    Key max();
    int size();

    // [ 1, 3, 4, 6, 9, 0 , 15, 8, 20, 5 ,4 ]
}
