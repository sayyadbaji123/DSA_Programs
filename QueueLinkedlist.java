package queue;

import java.util.NoSuchElementException;

public class QueueLinkedlist {
	
	Node head;
	Node tail;
	int size;
	
	public boolean isEmpty()
	{
		return head==null;
		
	}
	
	
public void enqueueinsert(int val)
{
	Node newNode=new Node(val);
	if(tail==null)
	{
		tail=head=newNode;
		
	}
	else {
		tail.next=newNode;
		tail=newNode;
		
	}
	size++;

}

public int dequeue()
{
	if(head==null)
	{
		throw new NoSuchElementException("no element found");
		
	}
	int number=head.val;
	if(head==null) {
		tail=null;
		
	}
	size--;
	return number;
}
public int peek()
{
	return head.val;
	
}
public void display()
{
	Node temp=head;
	
	while(temp!=null)
	{
		System.out.println(temp.val);
		temp=temp.next;
	}
	
	
}


public static void main(String[] args)
{

	
	
	QueueLinkedlist q = new QueueLinkedlist();
	System.out.println("enqueue the elements");
	q.enqueueinsert(37);
	q.enqueueinsert(47);
	q.enqueueinsert(57);
	q.enqueueinsert(67);
	q.enqueueinsert(77);
	
	System.out.println(q.peek());
	System.out.println(q.dequeue());
	System.out.println(q.isEmpty());
	q.dequeue();
	q.display();
	
	System.out.println(q.size);
	
	
}

}