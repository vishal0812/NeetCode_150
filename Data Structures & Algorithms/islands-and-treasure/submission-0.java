class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int dir[][] = {{1,0},{-1,0},{0,1},{0,-1}};
        int m = grid.length;
        int n = grid[0].length;
        Queue<int []> q = new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 0){
                    q.add(new int[]{i,j});
                }
            }
        }
        while(!q.isEmpty()){
            int [] curr = q.poll();
            int i = curr[0];
            int j = curr[1];
            for(int d=0;d<4;d++){
                int nr = dir[d][0] + i;
                int nc = dir[d][1] + j;
                if(nr>=0 && nc>=0 && nr<m && nc<n && grid[nr][nc] == 2147483647){
                    q.add(new int[]{nr,nc});
                    grid[nr][nc] = grid[i][j] + 1;
                }
            }
        }
    }
}
