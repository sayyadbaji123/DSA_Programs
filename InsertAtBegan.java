package linkedlist;

public class InsertAtBegan {

public LinkedListDemo1 insert(LinkedListDemo1 head,int valueinsert)
{
	LinkedListDemo1 newNode=new LinkedListDemo1(valueinsert);
	newNode.next=head;
	head= newNode;
	return head;
	
			
}
public LinkedListDemo1 insertinMid(LinkedListDemo1 head,int valueinsert,int pos)
{
	LinkedListDemo1 newNode=new LinkedListDemo1(valueinsert);
	LinkedListDemo1 ptr=head;
	for(int i=1;i<pos-1;i++)
	{
		ptr=ptr.next;
		
	}
	newNode.next=ptr.next;
	ptr.next=newNode;
	return head;
			
}
public LinkedListDemo1 insertEnd(LinkedListDemo1 head,int valueinsert)
{
	LinkedListDemo1 newNode=new LinkedListDemo1(valueinsert);
	LinkedListDemo1 ptr=head;
	while(ptr.next!=null)
	{
		ptr=ptr.next;
	}
	ptr.next=newNode;
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
	
	l1.next=l2;
	l2.next=l3;
	l3.next=l4;
	l4.next=null;
	
	
	InsertAtBegan i= new InsertAtBegan();
	System.out.println("traversing elements before insertion");
	LinkedListDemo1 head=l1;
	i.traverse(head);
	
	System.out.println();
	head=i.insert(head,11);
	System.out.println("After inserting value at beg");
	i.traverse(head);	

	System.out.println();
	System.out.println("After inserting value at middle");
	i.traverse(head);	
	i.insertinMid(head,55,2);
	i.traverse(head);
	
	
	System.out.println();
	System.out.println("InsertAtEnd");
	i.traverse(head);	
	i.insertEnd(head,57);
	i.traverse(head);	
}
}
	

