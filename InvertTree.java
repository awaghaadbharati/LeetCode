package Completed;


public class InvertTree {
	public static void main(String[] args) {

	}
	public TreeNode invertTree(TreeNode root) {
		traverse(root);
		return root;
	}
	public void traverse(TreeNode node) {
		if(node.left==null && node.right!=null)
			node.left=node.right;
		else if(node.right==null && node.left!=null)
			node.right=node.left;
		else if(node.left!=null && node.right!=null)
			{
			TreeNode temp = node.left;
			node.left = node.right;
			node.right = temp;
			}
		if (node.left != null)
			traverse(node.left);
		if (node.right != null)
			traverse(node.right);

	}
}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
