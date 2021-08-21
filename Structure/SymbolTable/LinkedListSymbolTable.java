package Structure.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class LinkedListSymbolTable<Key extends Comparable<Key>, Value> extends AbstractSymbolTable<Key, Value>{

    private Node tableList;
    
    public LinkedListSymbolTable() {
        this.tableList = null;
    }

    @Override
    public void put(Key key, Value value) {
        // TODO Auto-generated method stub
        Node curNode = tableList;

        while (curNode !=  null) {
            if (curNode.key.equals(key)) {
                curNode.value = value;
                return;
            }

            curNode = curNode.next;
        }

        Node newNode = new Node(key, value);
        newNode.next = tableList;
        tableList = newNode;
    }

    @Override
    public Value get(Key key) {
        // TODO Auto-generated method stub

        Node curNode = tableList;
        
        while (curNode != null) {
            if (curNode.key.equals(key)) {
                return curNode.value;
            }

            curNode = curNode.next;
        }

        
        return null;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        int size = 0;
        Node curNode = tableList;

        while (curNode != null) {
            if (curNode.value != null) {
                ++size;
            }

            curNode = curNode.next;
        }

        return size;
    }

    @Override
    public Iterable<Key> keys() {
        // TODO Auto-generated method stub
        List<Key> keys = new ArrayList<>();

        Node curNode = tableList;

        while (curNode != null) {
            if (curNode.value != null) {
                keys.add(curNode.key);
            }

            curNode = curNode.next;
        }

        return keys;
    }

    class Node {
        Key key;
        Value value;
        Node next;

        public Node() {

        }

        public Node(Key key,Value value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return "[" + key + " : " + value+ "]";
        }

    }
    
}
