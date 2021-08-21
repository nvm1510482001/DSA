package Structure.Graph;

import java.util.LinkedList;
import java.util.List;

public class AdjacencyListsGraph extends AbstractGraph {

    private List<Integer>[] adjs;

    // [ listA, listB, listC ]
    // listA: những đỉnh kề vs A
    // listB: những đỉnh kề vs B
    // listC: những đỉnh kề vs C


    public AdjacencyListsGraph(int n) {
        super(n);
        //TODO Auto-generated constructor stub
        adjs = new List[n];
        for (int u = 0; u < n; u++) {
            adjs[u] = new LinkedList<>();
        }
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        int size = 0;

        for (int u = 0; u < n; u++) {
            size += adjs[u].size();
        }

        return size/2;
    }

    @Override
    public int degree(int u) {
        // TODO Auto-generated method stub
        return adjs[u].size();
    }

    @Override
    public Iterable<Integer> adjacency(int u) {
        // TODO Auto-generated method stub
        return adjs[u];
    }

    @Override
    public void addEdge(int u, int v) {
        // TODO Auto-generated method stub
        for (Integer x: adjs[u]) {
            if (x == v) {
                return;
            }
        }
        
        adjs[u].add(v);
        adjs[v].add(u);
    }

}
