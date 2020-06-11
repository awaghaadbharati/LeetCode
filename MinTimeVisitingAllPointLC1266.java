package Completed;

public class MinTimeVisitingAllPointLC1266 {
	public static void main(String[] args) {
		int arr[][]= {{1,1},{3,4},{-1,0}};
		System.out.println(minTimeToVisitAllPoints(arr));
	}

	public static int minTimeToVisitAllPoints(int[][] points) {
		int xDiff=0,yDiff=0,result=0;
		for(int i=0;i<points.length -1;i++)
		{
			xDiff=Math.abs(points[i][0]-points[i+1][0]);
			yDiff=Math.abs(points[i][1]-points[i+1][1]);
			result+=Math.max(xDiff, yDiff);
		}
		return result;
	}
}
