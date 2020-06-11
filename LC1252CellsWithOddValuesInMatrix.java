package Completed;

import java.util.HashMap;

public class LC1252CellsWithOddValuesInMatrix {
	public static void main(String[] args) {
		// n = 2, m = 3,
		int indices[][] = { { 40, 5 } };
		System.out.println(oddCells(48, 37, indices));
	}

	public static int oddCells(int n, int m, int[][] indices) {
		HashMap<Integer, Integer> rowMap = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> colMap = new HashMap<Integer, Integer>();
		int count = 0;
		for (int i = 0; i < indices.length; i++) {
			if (rowMap.containsKey(indices[i][0]))
				rowMap.put(indices[i][0], rowMap.get(indices[i][0]) + 1);
			else
				rowMap.put(indices[i][0], 1);
			if (colMap.containsKey(indices[i][1]))
				colMap.put(indices[i][1], colMap.get(indices[i][1]) + 1);
			else
				colMap.put(indices[i][1], 1);
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int temp = 0;
				if (rowMap.containsKey(i))
					temp += rowMap.get(i);
				if (colMap.containsKey(j))
					temp += colMap.get(j);
				if (temp % 2 != 0)
					count++;
			}
		}
		return count;

	}
}
