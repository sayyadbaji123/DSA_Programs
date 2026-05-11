package linkedlist;

public class DeleteAtbegan {
	
	public LinkedListDemo1 del(LinkedListDemo1 head)
	{
		
	
		head= head.next;
		return head;			
	}
	
	public LinkedListDemo1 delmid(LinkedListDemo1 head,int pos)
	
	{
		LinkedListDemo1 temp=head;
		for(int i=1;i<pos-1;i++)
		{
			temp=temp.next;
			
		}
		LinkedListDemo1 nodeTodelete=temp.next;
		LinkedListDemo1 nextNode=nodeTodelete.next;
		temp.next=nextNode;
		return head;
	}
	public LinkedListDemo1 delEnd(LinkedListDemo1 head)
	{

		LinkedListDemo1 ptr=head;
		while(ptr.next!=null)
		{
			ptr=ptr.next;
		}
		ptr.next=null;
		return head;
				
	}
	
	
	public void traverse(LinkedListDemo1 head)
	{
		LinkedListDemo1 temp=head;
		while(temp!=null)
		{
		System.out.println(temp.val);
		
	    	temp=temp.next;
		
		}
	}

		public static void main(String[] args)
		{
			LinkedListDemo1 l1=new LinkedListDemo1(34);
			LinkedListDemo1 l2=new LinkedListDemo1(52);
			LinkedListDemo1 l3=new LinkedListDemo1(23);
			LinkedListDemo1 l4=new LinkedListDemo1(67);
			LinkedListDemo1 l5=new LinkedListDemo1(93);
			LinkedListDemo1 l6=new LinkedListDemo1(27);
		   
			l1.next=l2;
			l2.next=l3;
			l3.next=l4;
			l4.next=l5;
			l5.next=l6;
			l6.next=null;
		
			//travesring of nodes
			
			DeleteAtbegan d= new DeleteAtbegan();
			System.out.println("traversing elements before insertion");
			LinkedListDemo1 head=l1;
			d.traverse(head);// without applyi g delete case
		
			System.out.println();
			// delete at beg
			head=d.del(head);
			d.traverse(head);
			
			d.delmid(head,2);
			System.out.println();
			System.out.println("del at mid");
			d.traverse(head);
			
			System.out.println();
			System.out.println("del");

			head=d.delEnd(head);
			d.traverse(head);
			
			
			
			
			
			
			
			
			

	}

}
