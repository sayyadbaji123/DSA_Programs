package Doublylinkedlist;

public class DoubleLinkedList {
	


		int val;
		 DoubleLinkedList next;
		 DoubleLinkedList prev;
		 
			
		public DoubleLinkedList(int x)
		{
			this.val=x;
			next=null;
			prev=null;
			
			}
		public static void main(String[] args)
		{
			
			DoubleLinkedList l1= new DoubleLinkedList(67);
			DoubleLinkedList l2= new DoubleLinkedList(17);
			DoubleLinkedList l3= new DoubleLinkedList(37);
			DoubleLinkedList l4= new DoubleLinkedList(57);
		
			
			
			l1.next=l2;
			l2.next=l3;
			l3.next=l4;
			l4.next=null;
		
		   DoubleLinkedList  temp=l1;
			while(temp!=null)
			{
				System.out.print(temp.val+" ");
				temp=temp.next;

			}
			
		}
		
	}



