import java.util.Arrays;

public class LeetCode977 {
	public static void main(String[] args) {
		int arr[]= {-4,-1,0,3,10};
		arr=sortedSquares(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}

	public static int[] sortedSquares(int[] A) {
		for(int i=0;i<A.length;i++)
		{
			A[i]=A[i]*A[i];
		}
		Arrays.sort(A);
		return A;
	}
}
