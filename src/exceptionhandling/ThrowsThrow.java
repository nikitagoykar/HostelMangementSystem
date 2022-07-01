package exceptionhandling;

class ThrowsThrow 
{
	static void method()
	{
		try
		{
			throw new ArithmeticException();
		}
		catch (ArithmeticException e)
		{
			System.out.println("caught and re-thrown");
			throw e;
		}
	}
}
   class exception
   {
	public static void main(String[] args) {
		
		try 
		{
			ThrowsThrow.method();
		}
		catch (Exception e)
		{
			System.out.println("caugth in main method"+e);
		}
	}

}
