class Solution {
    public boolean isValidSudoku(char[][] grid) {
        int n = 9;
        //rows validation
        for(int i=0; i<n; i++){
            boolean seen[] = new boolean[n+1];
            for(int j=0; j<n; j++){
                if(grid[i][j] == '.'){
                    continue;
                }
                int num = grid[i][j] - '0';
                if(seen[num]){
                    return false;
                }
                seen[num] = true;
            }
        }

        //column validation
        for(int j=0; j<n; j++){
            boolean seen[] = new boolean[n+1];
            for(int i=0; i<n; i++){
                if(grid[i][j] == '.'){
                    continue;
                }
                int num = grid[i][j] - '0';
                if(seen[num]){
                    return false;
                }
                seen[num] = true;
            }
        }
        //3*3 matrix check
        for(int row = 0; row<9; row = row+3){
            for(int col = 0; col<9; col = col+3){
                boolean seen[] = new boolean[n+1];
                for(int i=row; i<row+3; i++){
                    for(int j=col; j<col+3; j++){
                        if(grid[i][j] == '.'){
                            continue;
                        }
                        int num = grid[i][j] - '0';
                        if(seen[num]){
                            return false;
                        }
                        seen[num] = true;
                    }
                }
            }
        }
        return true;
    }
}
