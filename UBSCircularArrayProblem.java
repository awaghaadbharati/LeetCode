import java.util.Arrays;
import java.util.List;

public class UBSCircularArrayProblem {
public static void main(String[] args) {
	
}
	public static int circularArray(int n, List<Integer> endNode) {
	    // Write your code here
	       int arr[]=new int[n+1];
	       Arrays.fill(arr,0);
	       int max=0;
	       for(int i=0;i<endNode.size()-1;i++)
	        {
	            int start=endNode.get(i);
	            int end=endNode.get(i+1);
	            if(end>=start)
	            {
	                for(int j=start;j<=end;j++)
	                {   
	                	int value=arr[j];
	                    if(value+1>max)
	                        max=value+1;
	                    arr[j]=arr[j]+1;
	                }
	            }
	            else{
	                for(int j=start;j<=n;j++)
	                {   
	                	int value=arr[j];
	                    if(value+1>max)
	                        max=value+1;
	                    arr[j]=arr[j]+1;
	                }
	                 for(int j=1;j<=end;j++)
	                {   int value=arr[j];
                    if(value+1>max)
                        max=value+1;
                    arr[j]=arr[j]+1;
	                }
	            }
	        }
	        for(int i=0;i<=n;i++)
	        {
	            if(arr[i]==max)
	                return i;
	        }
	        return max;
	    }

}

