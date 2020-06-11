package 30DaysLeetCodeChallenge;

public class LCDayEighteen {
	public static void main(String[] args) {
		int grid[][]={{1,3,1}, {1,5,1}, {4,2,1}};
		System.out.println(minPathSum(grid));
	}
	/*
	 * public static int minPathSum(int[][] grid) { return
	 * minPathSumUtil(grid,grid.length-1,grid[0].length-1); } public static int
	 * minPathSumUtil(int grid[][],int m,int n) {
	 * 
	 * if (n < 0 || m < 0) return Integer.MAX_VALUE; else if (m == 0 && n == 0)
	 * return grid[m][n]; else return grid[m][n] + Math.min( minPathSumUtil(grid,
	 * m-1, n), minPathSumUtil(grid, m, n-1) ); }
	 */
	
	//Dynamic programming approach
	 public static int minPathSum(int[][] grid) {
		 	int rows=grid.length,cols=grid[0].length; 
		 	int dp[][]=new int[rows][cols]; 
	        dp[0][0] = grid[0][0]; 
	  
	        for (int i = 1; i < rows; i++) 
	            dp[i][0] = dp[i-1][0] + grid[i][0]; 
	  
	        for (int j = 1; j <cols; j++) 
	            dp[0][j] = dp[0][j-1] + grid[0][j]; 
	  
	        for (int i = 1; i < rows; i++) 
	            for (int j = 1; j < cols	; j++) 
	            	dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j]; 
	  
	        return dp[rows-1][cols-1]; 
	} 
}

