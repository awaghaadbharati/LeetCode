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
    StringBuilder str1=new StringBuilder();
    StringBuilder str2=new StringBuilder();
    while(l1!=null)
    {
    	str1.append(l1.val);
    	l1=l1.next;
    }
    while(l2!=null)
    {
    	str2.append(l2.val);
    	l2=l2.next;
    }
    System.out.println(str1.toString());
    System.out.println(str2.toString());
    int result=Integer.parseInt(str1.toString())+Integer.parseInt(str2.toString());
    System.out.println(result);
    l1= new ListNode(result%10);
    ListNode current=l1;;
    result=result/10;		
    while(result!=0)
    {
    	ListNode temp=new ListNode(result%10);
    	current.next=temp;
    	current=current.next;
    	result=result/10;
    }
    return l1;
}
}
class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }