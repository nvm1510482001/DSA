package Structure.SymbolTable;

public abstract class AbstractSymbolTable<Key extends Comparable<Key>, Value> implements ISymbolTable<Key , Value>{
    
    @Override
    public void delete(Key key) {
        if (contains(key)) {
            put(key, null);
        }
    }

    @Override
    public boolean contains(Key key) {
        return get(key) != null;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }
}
