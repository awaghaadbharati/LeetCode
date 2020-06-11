package Completed;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// create a queue of int array and push add it in result and
public class MatrixCellsInDistanceOrder1030Easy {
	public static void main(String[] args) {

	}

	public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
		int result[][] = new int[R * C][2];
		int resultIndex = 0;
		int temp[] = new int[2];
		int auxArray[][] = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
		boolean visited[][] = new boolean[R][C];
		for (int i = 0; i < R; i++) {
			Arrays.fill(visited[0], false);
		}
		Queue<int[]> queue = new LinkedList<int[]>();
		temp[0] = r0;
		temp[1] = c0;
		result[resultIndex++] = temp;
		visited[r0][c0] = true;
		queue.add(temp);
		while (!queue.isEmpty()) {
			temp = queue.poll();
			{
				for (int i = 0; i < auxArray.length; i++) {
					r0 = temp[0] + auxArray[i][0];
					c0 = temp[1] + auxArray[i][1];
					// System.out.println(r0+ " "+ c0);
					if (c0 >= 0 && r0 >= 0 && r0 < R && c0 < C && visited[r0][c0] == false) {
						System.out.println(r0 + " " + c0);
						result[resultIndex][0] = r0;
						result[resultIndex][1] = c0;
						queue.add(result[resultIndex++]);
						visited[r0][c0] = true;
					}
				}
			}

		}
		return result;
	}
}
