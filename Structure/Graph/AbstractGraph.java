package Structure.Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public abstract class AbstractGraph implements IGraph {
    protected int n;

    protected boolean[] visited;

    public AbstractGraph(int n) {
        this.n = n;
        this.visited = new boolean[n];
        Arrays.fill(visited, false);
    }

    @Override
    public int order() {
        return this.n;
    }

    void dfs(int u) {
        System.out.println(u);
        visited[u] = true;
        Iterable<Integer> adjs = adjacency(u);
        for (int v: adjs) {
            if(!visited[v]) {
                dfs(v);
            }
        }
    }

    void bfs(int u) {
        visited[u] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(u);
        while (!queue.isEmpty()) {
            int c = queue.poll();
            Iterable<Integer> adjs = adjacency(c);
            for (Integer value: adjs) {
                if (!visited[value]) {
                    visited(value);
                    visited[value] = true;
                    queue.offer(value);
                }
            }
        }
    }

    void visited(int u) {
        System.out.println(u);
    }
}
