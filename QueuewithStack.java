package queue;

import java.util.Stack;

public class QueuewithStack {
	
	
	
	
		Stack<Integer> input=new Stack();
		Stack<Integer> output=new Stack();
		
	
	
	public void push(int data)
	{
		input.push(45);
		input.push(30);
		input.push(55);
		input.push(65);	
		
		
     if(input.isEmpty())
     {
    	System.out.println("no elements");
    	
     }
     else
     {
    	 output.push(input.peek());
     }
	}
	
	
	
	public static void main(String[] args)
	{
		Stack<Integer> stack=new Stack();
		stack.push(45);
		stack.push(30);
		stack.push(55);
		stack.push(65);	
	 
	}
	


}
