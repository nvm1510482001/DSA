package Structure.Graph;

public interface IGraph {  
    int order();
    int size();
    int degree(int u);
    Iterable<Integer> adjacency(int u);
    void addEdge(int u, int v);
}
