package Completed;

public class ClimbingStairs {
public static void main(String[] args) {
	System.out.println(climbStairs(1));
}
public static int climbStairs(int n) {
	int totalWays[]=new int[n];
	for(int i=0;i<n;i++)
	{
		if(i==0)
			totalWays[i]=1;
		else if(i==1)
			totalWays[i]=2;
		else
			totalWays[n-1]=totalWays[n-2]+totalWays[n-3];
	}
		
	return totalWays[n-1];
}
}
