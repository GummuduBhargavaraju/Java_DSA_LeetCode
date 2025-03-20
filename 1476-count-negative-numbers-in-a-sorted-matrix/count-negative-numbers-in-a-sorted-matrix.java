class Solution {
    public int countNegatives(int[][] grid) {
        int gridRow = grid.length;
        int gridcol = grid[0].length;
        int row = 0; int col = gridcol -1 ; int count = 0;
        while(row < gridRow && col >= 0)
        {
            if(grid[row][col] < 0)
            {
                count += gridRow -row;
                col --;
            }
            else{
                row ++;
            }
        }
        return count;    
    }
}