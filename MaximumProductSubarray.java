package Completed;

public class MaximumProductSubarray {
public static void main(String[] args) {
	int nums[]= {-2,3,-4};
	System.out.println(maxProduct(nums));
}
public static int maxProduct(int[] nums) {
 int dp[][]=new int[nums.length][nums.length];
 int maxProduct=Integer.MIN_VALUE;
 for(int i=0;i<nums.length;i++)
 {
	 dp[i][i]=nums[i];
	 if(dp[i][i]>maxProduct)
		 maxProduct=dp[i][i];
 }
 for(int i=0;i<nums.length;i++)
 {
	 for(int j=i+1;j<nums.length;j++)
	 {
		 dp[i][j]=dp[i][j-1]*nums[j];
		 if(dp[i][j]>maxProduct)
			 maxProduct=dp[i][j];
	 }
 }
 return maxProduct;
} 
}
