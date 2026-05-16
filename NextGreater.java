package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreater {
	 public static int[] next(int[] arr)
	 {
		 int n=arr.length;
		 int res[]=new int[n];
		 Stack<Integer> stack=new Stack();
		 for(int i=n-1;i>=0;i--)
		 {
			 while(!stack.isEmpty()&& stack.peek()<=arr[i])
			 {
				 stack.pop();
				 
			 }
			 if(stack.isEmpty())
			 {
				 res[i]=-1;
				 
			 }
			 else
			 {
				 res[i]=stack.peek();
				 
			 }
			 stack.push(arr[i]);
			 
		 }
		 return res;
		 
	 }
	 public static void main(String[] args)
	 {
		 int arr[]= {4,5,8,12,3,2,9,1};
		 System.out.println("original array:" +Arrays.toString(arr));
		 int result[]=next(arr);
		System.out.println("result array: "+Arrays.toString(result));
		
	 }
	
}
