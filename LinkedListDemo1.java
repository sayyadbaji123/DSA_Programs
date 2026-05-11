package linkedlist;

public class LinkedListDemo1 {

	int val;
	LinkedListDemo1 next;
	public LinkedListDemo1(int x)
	{
		this.val=x;
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
		
		LinkedListDemo1 temp=l1;
		while(temp!=null)
		{
			System.out.println(temp.val);
			temp=temp.next;

		}
		
	}
	
}
