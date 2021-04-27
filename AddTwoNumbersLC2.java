package Completed;

public class AddTwoNumbersLC2 {
public static void main(String[] args) {
	ListNode l1=new ListNode(2);
	l1.next=new ListNode(4);
	l1.next.next=new ListNode(3);
	ListNode l2=new ListNode(5);
	l2.next=new ListNode(6);
	l2.next.next=new ListNode(4);
	l1=addTwoNumbers(l1,l2);
	while(l1!=null)
	{
		System.out.println(l1.val);
		l1=l1.next;
	}
}
public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	ListNode result = null;
	ListNode prev = null;
	int carry = 0, sum;
	while (l1 != null || l2 != null) {
		sum = carry + (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);
		ListNode temp = new ListNode(sum % 10);
		carry = sum >= 10 ? sum / 10 : 0;
		if (result == null)
			result = temp;
		else
			prev.next = temp;
		prev = temp;
		if (l1 != null)
			l1 = l1.next;
		if (l2 != null)
			l2 = l2.next;

	}
	if (carry > 0) {
		prev.next = new ListNode(carry);
	}
	return result;
}
}
class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }