package TreesAndGraphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AncestorsOfNodeInDAG {

    private void dfs(List<Integer>[] graph, int parent, int curr, List<List<Integer>> ans, boolean[] visit) {
        visit[curr] = true;
        for (int dest : graph[curr]) {
            if (!visit[dest]) {
                ans.get(dest).add(parent);
                dfs(graph, parent, dest, ans, visit);
            }
        }
    }

    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> ancestors = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ancestors.add(new ArrayList<>());
        }

        List<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
        }

        for (int i = 0; i < n; i++) {
            dfs(graph, i, i, ancestors, new boolean[n]);
        }

        for (int i = 0; i < n; i++) {
            Collections.sort(ancestors.get(i));
        }

        return ancestors;
    }
}
