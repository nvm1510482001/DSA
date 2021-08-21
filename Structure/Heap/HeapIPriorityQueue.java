package Structure.Heap;

public class HeapIPriorityQueue<Key extends Comparable<Key>> implements HeapInterface<Key> {

    private Node root;
    private int position;

    public HeapIPriorityQueue() {
        this.root = null;
        this.position = 0;
    }

    @Override
    public void insert(Key key) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Key deleteMax() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Key max() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }
    
    class Node {
        Key data;
        Node right;
        Node left;

        public Node() {

        }

        public Node(Key data) {
            this.data = data;
        }
    }


}
