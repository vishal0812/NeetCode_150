class Solution {
    public boolean validTree(int n, int[][] edges) {
        int parent[] = new int[n];
        for(int i=0; i<n; i++){
            parent[i] = i;
        }
        int rank[] = new int[n];
        for(int i=0; i<edges.length;i++){
            int x = edges[i][0];
            int y = edges[i][1];
            int parent_x = find(x, parent);
            int parent_y = find(y, parent);
            if(parent_x == parent_y){
                return false;
            }
            union(x, y, parent, rank);
        }
        int count = 0;
        for(int i=0;i<n;i++){
            if(parent[i] == i){
                count++;
            }
        }
        if(count >1){
            return false;
        }
        return true;
    }
    public int find(int x, int parent[]){
        if(x == parent[x]){
            return x;
        }
        return parent[x] = find(parent[x], parent);
    }
    public void union(int x, int y, int parent[], int rank[]){
        int parent_x = find(x, parent);
        int parent_y = find(y, parent);
        if(parent_x == parent_y){
            return;
        }
        if(rank[parent_x] < rank[parent_y]){
            parent[parent_x] = parent_y;
        }
        else if(rank[parent_x] > rank[parent_y]){
            parent[parent_y] = parent_x;
        }
        else{
            parent[parent_y] = parent_x;
            rank[parent_x] += 1;
        }
    }
}
