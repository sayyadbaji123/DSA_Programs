    package Stack;
	import java.util.*;
	class StackDemo
	{
	    //array declaration
	    int data[];
	  //top most element
	    int top;

	    public StackDemo(int capacity)
	    {
	    	
	        data=new int[capacity]; //array declaration
	        top=-1;// initial value top most element
	    }
	    // is stack empty
	    public boolean isEmpty()
	    {
	        return top==-1;
	    }
	    // is stack full
	    public boolean isFull()
	    {
	        return top==data.length-1;
	    }
	    // insert element into the stack
	    public void push(int value)
	    {
	        if(isFull())
	        {
	            throw new RuntimeException("Stack Overflow");
	        }
	        data[++top]=value;  //top=top+value;
	    }
	    // returns the top most element
	    public int peek()
	    {
	        if(isEmpty())
	        {
	            throw new RuntimeException("Stack Underflow");
	        }
	        return data[top];
	    }
	    // remove top element
	    public int pop()
	    {
	        if(isEmpty())
	        {
	            System.out.println("Stack is Empty");
	        }
	        return data[top--];
	    }
	    // size of the stack
	    public int size()
	    {
	        return top+1;
	    }
	    // display all the elements in the stack
	    public void display()
	    {
	        if(isEmpty())
	        {
	            System.out.println("Stack is Empty");
	            return;
	        }
	        System.out.println("Bottom ---------> 5top");
	        for(int i=0;i<=top;i++)
	        {
	            System.out.print(data[i]+" ");
	        }
	        System.out.println();
	    }
	    public static void main(String z[])
	    {
	        StackDemo st=new StackDemo(5);
	        st.push(56);
	        st.push(22);
	        st.push(88);
	        st.push(11);

	        st.display();
	        System.out.println("Top Element : "+st.peek());
	        st.pop();
	        System.out.println("Top Element : "+st.peek());
	        System.out.println("Size: "+st.size());
	        System.out.println("is Stack Empty: "+st.isEmpty());
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

