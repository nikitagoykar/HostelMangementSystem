package exceptionhandling;

public class TryCatch {

	public static void main(String[] args) {
	int a,b,c;
	try
	{
		System.out.println("you are In try Block");
	   a=10;
	    b=2;
	c=a/b;
	System.out.println("c="+c);
	}
	catch(ArithmeticException ae)
	{
		System.out.println("exception caught "+ ae);
		
	}
	System.out.println("after catch");
	}

}
