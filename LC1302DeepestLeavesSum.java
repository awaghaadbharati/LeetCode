package Completed;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Map.Entry;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
		left=null;
		right=null;
	}
}

public class LC1302DeepestLeavesSum {
	static HashMap<TreeNode, Integer> map = new HashMap<TreeNode, Integer>();
	static int totalHeight=0;
	public static void main(String[] args) {
		// HashMap<String, Integer> map=new HashMap<String, Integer>();
		// root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
		TreeNode root = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		TreeNode sixth = new TreeNode(6);
		TreeNode seventh = new TreeNode(7);
		TreeNode eighth = new TreeNode(8);
		root.left = second;
		root.right = third;
		second.left = fourth;
		second.right = fifth;
		//third.left = null;
		third.right = sixth;
		//sixth.left = null;
		sixth.right = eighth;
		fourth.left = seventh;
		//fourth.right=null;
		//fifth.left=null;
		//fifth.right=null;
		System.out.println(deepestLeavesSum(root));
				
	}
	/*
	 * static int deepestLeavesSum(TreeNode root) { Queue<TreeNode> queue=new
	 * LinkedList<TreeNode>(); int max=1,sum=0; map.put(root, 1); while(root!=null)
	 * { int temp=map.get(root)+1; if(root.left!=null) { if(temp>max) max=temp;
	 * queue.add(root.left); map.put(root.left, temp);
	 * 
	 * } if(root.right!=null) { if(temp>max) max=temp; queue.add(root.right);
	 * map.put(root.right,temp); } root=queue.poll();
	 * 
	 * } // System.out.println(max); for(Entry<TreeNode, Integer>
	 * entry:map.entrySet()) { if(entry.getValue()==max) { sum+=entry.getKey().val;
	 * } } return sum; }
	 */
	
	static int height(TreeNode root) {
		if(root == null) 
			return 0;
		
		return 1 + Math.max(height(root.left), height(root.right));
	}
	
	static int checkHeightAndAdd(TreeNode root, int currentHeight) {
		if(root == null) {
			return 0;
		}
		int toAdd = 0;
		if(currentHeight == totalHeight)
			toAdd = root.val;
		return toAdd + checkHeightAndAdd(root.left, currentHeight+1) + checkHeightAndAdd(root.right, currentHeight+1);
	}
	
	static int deepestLeavesSum(TreeNode root) {
		totalHeight = height(root);
		if(root == null)
			return 0;
		
		return checkHeightAndAdd(root, 1);
	}
}

