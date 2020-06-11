package Completed;
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
 
public class LeetCode237 {
	public static void main(String[] args) {
		// [4,5,1,9],
		ListNode head=new ListNode(4);
		ListNode second=new ListNode(5);
		ListNode third=new ListNode(1);
		ListNode fourth=new ListNode(9);
		head.next=second;
		second.next=third;
		third.next=fourth;
		deleteNode(second);
		while(head!=null)
		{
			System.out.println(head.val);
			head=head.next;
		}
	}

	public static void deleteNode(ListNode node) {
		while(node.next!=null)
		{
			node.val=node.next.val;
			if(node.next.next==null)
				node.next=null;
			else
				node=node.next;
		}
		//node.next=null;
	}
}
