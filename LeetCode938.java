import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LeetCode938 {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(5);
		root.right = new TreeNode(15);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(7);
		root.right.right = new TreeNode(18);

	}

	public int rangeSumBST(TreeNode root, int L, int R) {
		int sum = 0;
		if (root == null)
			return sum;
		if (R >= root.val && root.val >= L)
			sum += root.val;
		if (root.val > R) {
			sum += rangeSumBST(root.left, L, R);
		}
		if (root.val < L)
			sum += rangeSumBST(root.right, L, R);
		return sum;
	}

	public void flatten(TreeNode root) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		
		TreeNode temp = root;
		while (temp != null) {
			stack.add(temp);
			temp = temp.left;
			
		}
		while (!stack.empty()) {
			temp = stack.pop();
			if (temp.right != null) {
				stack.add(temp.right);
				newRoot.right=temp.right;
			}
		}
		root=newRoot;
	}
	 public int maxDepth(TreeNode root) {
	      if(root==null)
	          return 0;
	      return 1+Math.min(maxDepth(root.left),maxDepth(root.right)) ; 
	    }
	 public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
	    
	     if()
		 
	    }
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}
