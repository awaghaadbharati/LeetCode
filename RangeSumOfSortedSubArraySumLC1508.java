import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RangeSumOfSortedSubArraySumLC1508 {
	public static int solveSubsequences(int[] nums, int n, int left, int right) {
		int result = 0;
		List<Integer> sumArrayList = new ArrayList<Integer>();
		int grid[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			Arrays.fill(grid[i], 0);
			grid[i][i] = nums[i];
			sumArrayList.add(nums[i]);
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				grid[i][j] = grid[i][j - 1] + nums[j];
				sumArrayList.add(grid[i][j]);
			}
		}
		for (int i = 0; i < sumArrayList.size(); i++) {
			if (sumArrayList.get(i) < 0)
				System.out.println(sumArrayList.get(i));
		}
		Collections.sort(sumArrayList);
		for (int i = left - 1; i < right; i++) {
			result = (int) (result % (Math.pow(10, 9) + 7) + sumArrayList.get(i));
		}
		return (int) (result % (Math.pow(10, 9) + 7));
	}
}
