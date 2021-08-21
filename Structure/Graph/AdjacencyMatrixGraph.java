package Structure.Graph;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyMatrixGraph extends AbstractGraph{

    private boolean[][] matrixGraph;

    public AdjacencyMatrixGraph(int n) {
        super(n);
        matrixGraph = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixGraph[i][j] = false;
            }
        }
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        // Số cạnh của đồ thị
        int size = 0;
        for (int u = 0; u < n; u++) {
            for (int v = 0; v < n; v++) {
                if (matrixGraph[u][v]) {
                    ++size;
                }
            }
        }

        return size/2;
    }

    @Override
    public int degree(int u) {
        // TODO Auto-generated method stub
        // Bậc của một đỉnh
        int degree = 0;
        for (int v = 0; v < n; v++) {
            if (matrixGraph[u][v]) {
                ++degree;
            }
        }
        return degree;
    }

    @Override
    public Iterable<Integer> adjacency(int u) {
        // TODO Auto-generated method stub
        // Liệt kê các đỉnh kề của đỉnh u
        List<Integer> adjs = new ArrayList<>();

        for (int v = 0; v < n; v++) {
            if (matrixGraph[u][v]) {
                adjs.add(v);
            }
        }
        
        return adjs;
    }

    @Override
    public void addEdge(int u, int v) {
        // TODO Auto-generated method stub
        matrixGraph[u][v] = true;
        matrixGraph[v][u] = true;
    }
    
}
