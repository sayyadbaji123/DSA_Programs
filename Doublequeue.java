package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Doublequeue {
public static void main(String[]args)
{
	Deque<Integer> q = new ArrayDeque<>();
	q.addFirst(1);
	q.addLast(3);
	q.addFirst(56);
	q.addLast(66);
	System.out.println("inserted elements : "+q);
	System.out.println("inserted elements : "+q.peekFirst());
	System.out.println("inserted elements : "+q.peekLast());
	q.addFirst(88);
	q.addLast(83);
	System.out.println("----deque elements----------");
	for(int num:q) {
		System.out.print(num+ " ");
		
	}
	
   
	
}
	

}
