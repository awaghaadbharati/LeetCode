import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode1313 {
public static void main(String[] args) {
	     int nums[] = {1,2,3,4};
	     ArrayList<Integer> arrayList=new ArrayList<Integer>();
		 for(int i=0;i<nums.length-1;i=i+2)
		 {
			 for(int j=0;j<nums[i];j++)
				 arrayList.add(nums[i+1]);
		 }
		 Integer[] array = arrayList.toArray(new Integer[0]);
		 int[] intArray = Arrays.stream(array).mapToInt(Integer::intValue).toArray();
		 return intArray;
		 for(Integer n: arrayList)
		 {
			System.out.println(n); 
		 }
	}
}
