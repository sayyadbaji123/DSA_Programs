package DSACODES;

public class updatearray {

	public static void main(String[] args)
	{
		int arr[]= {23,42,74,65};
		int position=2;
		int element=55;
		
		
		arr[position]=element;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"");
		}
		System.out.println();
		
		
		
		for(int nums:arr) {
			System.out.println(nums);
		}
		
	}
}
