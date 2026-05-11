package DSACODES;

public class LinearsrchDemo {
	
	public static int search(int[] arr,int target)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target) {
				System.out.println("element    "+arr[i]+"  is found at "+i);
				
			}	
		
		}
	
		
		
	
		return -1;
	}
	
	public static void main(String args[])
	{
		int arr[]= {12,89,37,29,57,29,94};
		int target=29;
		int pos=search(arr,target);
		if(pos==-1)
		{
			System.out.println("not found");
		}
		
	}

}
