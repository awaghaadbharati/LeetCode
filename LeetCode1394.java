import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class LeetCode1394 {
public static void main(String[] args) {
	int arr[] = {2,2,3,4};
	int initialValue=1;
	Arrays.sort(arr);
	ArrayList<Integer> arrayList=new ArrayList<Integer>();
	HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
	for(int i=0;i<arr.length;i++)
	{
		if(!map.containsKey(arr[i]))
		{
			map.put(arr[i],initialValue);
			arrayList.add(arr[i]);
		}
		else 
		{
			map.put(arr[i],map.get(arr[i])+1);
		}
	}
	for(int i=0;i<arrayList.size();i++)
	{
		if(map.get(arrayList.get(i))==arrayList.get(i))
		{
//			return arrayList.get(i);
		}
	}
}
}
