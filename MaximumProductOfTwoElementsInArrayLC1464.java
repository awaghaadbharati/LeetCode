package Completed;

public class MaximumProductOfTwoElementsInArrayLC1464 {
	public static void main(String[] args) {
		int nums[]= {3,7};
		System.out.println(maxProduct(nums));
	}

	public static int maxProduct(int[] nums) {
		int maxNumber=1,secondMaxNumber=1;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]>maxNumber)
			{
				secondMaxNumber=maxNumber;
				maxNumber=nums[i];
			}
			else if(nums[i]>secondMaxNumber)
				secondMaxNumber=nums[i];
		}
		return (maxNumber-1)*(secondMaxNumber-1);
	}
}
