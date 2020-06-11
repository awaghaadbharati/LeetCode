import java.util.Stack;

public class LeetCode1290 {
	public static void main(String[] args) {
		ListNode head=new ListNode(1);
		head.next=new ListNode(0);
		head.next.next=new ListNode(1);
		System.out.println(getDecimalValue(head));
	}

	public static int getDecimalValue(ListNode head) {
		Stack<Integer> stack=new Stack<Integer>();
		int count=0, number=0;
		
		while(head!=null)
		{
			stack.add(head.val);
			head=head.next;
		}
		while(!stack.isEmpty())
		{
			number=number+(int)Math.pow(2, count++)*stack.pop();
		}
		return number;
	}
}

/*class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}*/
}
