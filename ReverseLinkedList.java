
public class ReverseLinkedList {
	
	//with recursion
	 public ListNode reverseRecursionList(ListNode head) {
	        ListNode current=head;
			ListNode prev=null;
			head=helper(current, prev);
			return head;
	    }
	    public ListNode helper(ListNode current, ListNode prev)
		{
	        if(current==null)
	            return prev;
			else
			{
				ListNode temp=current.next;
				current.next=prev;
				prev=current;
				current=temp;
			    return helper(current, prev);
			}
		}
	public ListNode reverseList(ListNode head) {
        ListNode current=head;
        ListNode prev=null;
        while(current!=null)
        {
            ListNode temp=current.next;
            current.next=prev;
            prev=current;
            current=temp;
        }
        head=prev;
        return head;
    }
}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
