public class Solution {
    public int countServers(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length; 

        int [] row_count = new int [row]; 
        int [] col_count = new int [col]; 

      
        for (int r = 0; r < row; r++){
            for (int c = 0; c < col; c++){
                if (grid[r][c] == 1){
                    //count it 
                    row_count[r]++; 
                    col_count[c]++;
                }
            }
        }
  int res = 0; 

        for (int r = 0; r < row; r++){
            for (int c = 0; c < col; c++){
                if (grid[r][c] == 1 && Math.max(row_count[r], col_count[c]) > 1){
                    res++; 
                }
                
            }
        }
        return res; 
    }
    
}