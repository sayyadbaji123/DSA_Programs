package DSACODES;

public class Factorial_recursion {
	
	public static int  factrec(int n) {
		

	if(n<=1)
	{
		return 1;
		
	}
	
	return n*factrec(n-1);
	
}
public static void main(String args[])
{
	System.out.println(factrec(5));
}
}
