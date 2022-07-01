package exceptionhandling;

 class MyOwnException extends Exception
 {
	 MyOwnException(String str)

	{
		super(str);
	}

 }
//class EmployeeTest1 {
//	static void employeeAge(int age)throws MyOwnException
//	{
//		if(age<0)
//		{
//			MyOwnException obj= new MyOwnException("age can not be less than zero ");
//			throw obj;
//			
//		}
//		else
//		{
//			System.out.println("input is valid");
//			
//		}
//	   }
	/*public static void main(String []args) {
		try
		{
			employeeAge(24);
		}
		catch(EmployeeTest e)
		{
			e.printStackTrace();
		}
		
	}
}*/

class Myclass
{
	static void checkAge(int age) throws MyOwnException
	{
		if(age<18)
		{
			throw new MyOwnException("acess deined-you must have age  at least 18");
			
		}
		else
		{
			System.out.println("acess granted-  your age old enough ");
		}
		
	}
	public static void main(String []args) throws Exception 
	{
		checkAge(24);
	}
	
}
	