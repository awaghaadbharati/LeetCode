import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode1389 {
public static void main(String[] args) {
	int nums[] = {0,1,2,3,4};
	int	index[] = {0,1,2,2,1};
	ArrayList<Integer> target=new ArrayList<Integer>();
	for(int i=0;i<nums.length;i++)
	{
		//target.add(index(i), nums(i));
	}
	Integer[] array = target.toArray(new Integer[0]);
	int[] intArray = Arrays.stream(array).mapToInt(Integer::intValue).toArray();
	//return target.toArray();
	
}
}
