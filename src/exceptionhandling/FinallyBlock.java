package exceptionhandling;

public class FinallyBlock {

	public static void main(String[] args) {
		int a,b,c;
		try
		{
			System.out.println("you are In try Block");
		   a=12;
		    b=2;
		c=a/b;
		System.out.println("c="+c);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("exception caught "+ ae);
			
		}
		
		

finally
{
	System.out.println("in finally ---will always execute!!!!!");
	}
System.out.println("after finally  block");
}
}
