import java.util.Arrays;

public class LeetCode27 {
public static void main(String[] args) {
	int nums[] = {3,2,2,3};
	int val = 3;
	 int count=0;
	 for(int i=0; i<nums.length;i++)
		{
			if(nums[i]==val)
	        {
				nums[i]=Integer.MAX_VALUE;
				count++;
	        }
		 }
	 Arrays.sort(nums);
	 nums=Arrays.copyOf(nums, nums.length-count);
	 
}
}
