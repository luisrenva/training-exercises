package leetcode.exercises;

//LeetCode 200 Number of islands
//Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
//An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
public class NumberOfIslands {


    public static void main(String args[]) {
    	char [][] grid = {
    			{'1','1','1','1','0'},
    			{'1','1','0','1','0'},
    			{'1','1','0','0','0'},
    			{'0','0','0','0','0'}
        };
    	
    	 int numIslands = 0;
         int rows = grid.length;
         int cols = grid[0].length;

         for (int i = 0; i < rows; i++) {
             for (int j = 0; j < cols; j++) {
                 if (grid[i][j] == '1') {
                     numIslands++;
                     dfs(grid, i, j);
                 }
             }
         }

         System.out.println("Number of islands: "+numIslands);

    }

    public static void dfs(char grid[] [], int row, int column) {    	
    	if (row < 0 || row >= grid.length || column < 0 || column >= grid[0].length || grid[row][column] == '0') {
            return;
        }

        grid[row][column] = '0'; // Mark the current cell as visited
        dfs(grid, row + 1, column); // Explore down
        dfs(grid, row - 1, column); // Explore up
        dfs(grid, row, column + 1); // Explore right
        dfs(grid, row, column - 1); // Explore left

    }



}