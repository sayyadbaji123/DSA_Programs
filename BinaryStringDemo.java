package DSACODES;

public class BinaryStringDemo {
	
		
		public static void main(String[] args)
		{
			String arr[]= {"bahu","deva","soma","tarun"};
			int low=0;
			int high=arr.length-1;
			String target="soma";
			while(low<=high)
			{
			
			int mid=(low+high)/2;
		    int cmp=arr[mid].compareTo(target);
		    
		    if(cmp==0)
		    {
		    	System.out.println("found at: "+mid);
		    	return;
		    }
		    
		    else if(cmp<0)
		    {
		    	low=mid+1;
		    	
		    }
		    else
		    {
		    	high =mid+1;
		    }
			}
			
		    System.out.println("not found");
		    
			}
		
		
}
			
		   
		   
		   
			
				

	



