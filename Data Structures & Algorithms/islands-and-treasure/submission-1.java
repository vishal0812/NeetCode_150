class Solution {
    int dir[][] = {{1,0},{-1,0},{0,1},{0,-1}};

    public void islandsAndTreasure(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int INF = 2147483647;
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 0){
                    q.add(new int[]{i,j});
                }
            }
        }
        int level = 0;
        while(!q.isEmpty()){
            int s = q.size();
            level++;
            while(s-->0){
                int[] curr = q.poll();
                int r = curr[0];
                int c = curr[1];
                for(int i=0;i<4;i++){
                    int nr = dir[i][0] + r;
                    int nc = dir[i][1] + c;
                    if(nr>=0 && nc>=0 && nr<m && nc<n && grid[nr][nc] == INF){
                        grid[nr][nc] = level;
                        q.add(new int[]{nr, nc});
                    }
                }
            }
        }
    }
}
