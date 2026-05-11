package Stack;

public class StackLikedList {

	ListNode head;
	
	public StackLikedList()

	{
		head=null;
	}
	public void push(int value)
	{
		ListNode node=new ListNode(value);
		node.next=head;
		head=node;
			
	}
	public int pop()
	{
		int number=head.val;
		head=head.next;
		return number;
	}
	public int peek()
	{
		return head.val;
	}
	public boolean isEmpty() {
		return head==null;
	}
	public static void main(String[] args)
	{
		StackLikedList stack=new StackLikedList();
		stack.push(67);
		stack.push(79);
		stack.push(99);
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
	}

}
