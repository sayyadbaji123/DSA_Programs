package linkedlist;
public class ReversedLinkedList {
	
	public LinkedListDemo1 reverse(LinkedListDemo1 head){
		
		if(head==null)
		{
			return null;
			
		}
		if(head.next==null)
		{
			return head;
		}
		
		LinkedListDemo1 preNode=null;
		LinkedListDemo1 curNode=head;
		while(curNode!=null)
		{
			LinkedListDemo1 nextNode=curNode.next;
			curNode.next=preNode;
			preNode=curNode;
			curNode=nextNode;
			
		}
		head=preNode;
		return head;	
	}
	
	public void traverse(LinkedListDemo1 head)
	{
		LinkedListDemo1 ptr=head;
		while(ptr!=null)
		{
			System.out.print(ptr.val+" ");
			ptr=ptr.next;
		}
	}
	
	public static void main(String[] args)
	{
		LinkedListDemo1 l1=new LinkedListDemo1(67);
		LinkedListDemo1 l2=new LinkedListDemo1(47);
		LinkedListDemo1 l3=new LinkedListDemo1(57);
		LinkedListDemo1 l4=new LinkedListDemo1(17);
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=null;
		
		ReversedLinkedList r= new ReversedLinkedList();
		LinkedListDemo1 head=l1;
	
		System.out.println("Before reverse");
		r.traverse(head);
		System.out.println();
		head =r.reverse(head);
		System.out.println("After reverse");
		r.traverse(head);
	}

}
