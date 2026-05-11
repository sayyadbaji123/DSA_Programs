package DSACODES;

public class StringlinearDemo {

	public static void main(String[] args)
	{
		String arr[]= {"bahu","bali","deva","deva"};
		String target="deva";
		boolean found=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals(target))
			{
				found=true;
				System.out.println("element found at "+i);
			}
		}
		if(found==false)
		{
			System.out.println("not found!");
		}
	}
}