class Solution {
    public int countNegatives(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int low = 0;
        int count = 0;
        int i = 0,j = col-1;
        while(i<row && j>=0){
            if(grid[i][j]<0){
                count += row-i;
                j--;
            }
            else{
                i++;
            }
        }
        return count;
    }
}