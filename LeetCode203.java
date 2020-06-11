package Completed;
//import Completed.ListNode;

/*Remove all elements from a linked list of integers that have value val.

Example:

Input:  1->2->6->3->4->5->6, val = 6
Output: 1->2->3->4->5
*/
class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class LeetCode203 {
	public static void main(String[] args) {
		// 1->2->6->3->4->5->6
		ListNode head = new ListNode(1);

		ListNode second = new ListNode(2);
		ListNode third = new ListNode(6);
		ListNode fourth = new ListNode(6);
		ListNode fifth = new ListNode(4);
		ListNode sixth = new ListNode(5);
		ListNode seventh = new ListNode(6);

		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = seventh;

		head = removeElements(head, 6);
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
		System.out.println("Hello");

	}

	public static ListNode removeElements(ListNode head, int val) {
		while (head != null && head.val == val) {
			head = head.next;
		}
		ListNode temp = head;
		while (temp != null) {
			while(temp.next != null && temp.next.val == val) {
					temp.next = temp.next.next;
			}
			temp = temp.next;
		}
		return head;
	}
}
