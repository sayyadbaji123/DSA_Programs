package linkedlist;

public class Traversing {
	public void traverse(LinkedListDemo1  head)
	{
		LinkedListDemo1 ptr=head;
		while(ptr!=null)
		{
			System.out.println(ptr.val);
			ptr=ptr.next;
		}
	}
	
	public static void main(String[] args)
	{
		LinkedListDemo1 l1=new LinkedListDemo1((90));
		LinkedListDemo1 l2=new LinkedListDemo1((40));
		LinkedListDemo1 l3=new LinkedListDemo1((50));
		LinkedListDemo1 l4=new LinkedListDemo1((70));
		
		
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=null;
				
		
		Traversing tr=new Traversing();
		LinkedListDemo1 head=l1;
		tr.traverse(head);
		
		
		
	}

}
