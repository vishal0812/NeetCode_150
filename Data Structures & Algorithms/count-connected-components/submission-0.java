class Solution {
    public int countComponents(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0; i<n; i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0; i<edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        boolean vis[] = new boolean[n];
        int count = 0;
        for(int i=0; i<n; i++){
            if(!vis[i]){
                dfs(graph, i, vis);
                count++;
            }
        }
        return count;
    }
    public void dfs(ArrayList<ArrayList<Integer>> graph, int u, boolean vis[]){

        vis[u] = true;
        for(int v : graph.get(u)){
            if(!vis[v]){
                dfs(graph, v, vis);
            }
        }

    }
}
