class Solution {
    public boolean searchMatrix(int[][] grid, int target) {
        int m = grid.length;
        int n = grid[0].length;
        int i = 0;
        int j = n-1;
        while(i < m && j>=0){
            if(grid[i][j] == target){
                return true;
            }
            else if(grid[i][j] < target){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }
}
