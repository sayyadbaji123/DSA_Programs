package queue;

import java.util.Stack;

public class Queuestack {
	
	Stack<Integer> input = new Stack();
	Stack<Integer> output=new Stack();
	
	public void enqueue(int val)
	{
		input.push(val);
		
	}
	public int peek()
	{
		if(output.isEmpty())
		{
			while(!input.isEmpty())
			{
				output.push(input.pop());
				
			}
			
		}return output.peek();
		
		
	}
	
	public int dequeue()
	{
	peek();
	return output.pop();
	
	}
	public boolean isEmpty()

	{
		return input.empty() && output.empty();
		
	}

	public static void main(String[] args)
	{
		Queuestack q=new Queuestack();
		q.enqueue(55);
		q.enqueue(57);
		q.enqueue(59);
		q.enqueue(65);
		q.enqueue(69);
	
		System.out.println("peek the element "+q.peek());
		System.out.println("peek the element "+q.dequeue());
		System.out.println("peek the element "+q.peek());
		
		
	}
}
