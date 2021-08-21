package Structure.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EdgesListsGraph extends AbstractGraph {
    private List<Edge> edges;


    public EdgesListsGraph(int n) {
        super(n);
        //TODO Auto-generated constructor stub
        edges = new LinkedList<>();
    }

    
    @Override
    public int size() {
        // TODO Auto-generated method stub
        return edges.size() / 2;
    }

    @Override
    public int degree(int u) {
        // TODO Auto-generated method stub
        int d = 0;
        for(Edge edge : edges) {
            if (edge.u == u) {
                d++;
            }

            // {(1, 2) {1, 5}}
            // degree(1) edge.u == 1
        }
        return d;
    }

    @Override
    public Iterable<Integer> adjacency(int u) {
        // TODO Auto-generated method stub
        List<Integer> adjs = new ArrayList<>();

        for(Edge edge : edges) {
            if (edge.u == u) {
                adjs.add(edge.v);
            }

            // {(1, 2) {1, 5}}
            // degree(1) edge.u == 1
        }


        return adjs;
    }

    @Override
    public void addEdge(int u, int v) {
        // TODO Auto-generated method stub
        for (Edge e : edges) {
            if ((e.u == u && e.v ==v) || (e.u == v && e.v == u)) {
                return;
            }
        }

        Edge edge = new Edge(u, v);
        edges.add(edge);
    }
    
    class Edge {
        int u;
        int v;

        Edge(int u, int v) {
            this.u = u;
            this.v = v;
        }
    }
}
