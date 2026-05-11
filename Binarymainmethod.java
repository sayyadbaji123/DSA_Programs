package DSACODES;

public class Binarymainmethod {
	
	public static void main(String[] args)
	{
		int arr[]= {12,13,17,19,29,57};
		int low=0;
		int high=arr.length-1;
		int target=19;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==target)
			{
				System.out.println("element found at "+mid);
				return;
				
			}
			else if(arr[mid]<target) {
				
				low=mid+1;
				
			}
			else {
				
				high=mid-1;
			
			}
					
		}
		System.out.println("not found");
	}

}
