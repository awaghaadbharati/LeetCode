package Completed;

public class HouseRobber {

	public static void main(String[] args) {
		int nums[]= {2,7,9,3,1};
		System.out.println(rob(nums));
	}
	public static int rob(int[] nums) {
		int size=nums.length;
		if(size==0)
            return 0;
        if(size==1)
            return nums[0];
        int maxAmountDP[]=new int[size];
        for(int i=0;i<nums.length;i++)
        {
        	if(i==0)
        	{
        		maxAmountDP[i]=nums[i];
        	}
            else if(i==1)
            {
                maxAmountDP[i]=Math.max(maxAmountDP[i-1], nums[i]);
            }
        	else
        	{
        		maxAmountDP[i]=Math.max(maxAmountDP[i-2]+nums[i], maxAmountDP[i-1]);
        	}
        		
        }
        return maxAmountDP[size-1];
    }
}
