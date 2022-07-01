package exceptionhandling;

public class Demo1 {

	public static void main(String[] args) {
		 int a, b,c;
		 try
		 {
			 System.out.println("we are in try block");
			 a=11;
			 b=0;
			 c=a/b;
			 System.out.println("quotient"+c);
			 } 
catch(ArithmeticException e)
		 {
	        System.out.println("exception occur "+e);
		 }   
	System.out.println("after catch block");
		 }
	}
	


