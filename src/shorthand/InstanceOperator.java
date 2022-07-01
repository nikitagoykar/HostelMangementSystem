package shorthand;

public class InstanceOperator {

	public static void main(String[] args) 
	{
		// create a variable of string type
	    String name = "HELLO";
	    
	    // checks if name is instance of String
	    boolean result1 = name instanceof String;
	    System.out.println("name is an instance of String: " + result1);

	    // create an object ofInstanceOperator
	    InstanceOperator obj = new InstanceOperator();

	    // checks if obj is an instance of InstanceOperator
	    boolean result2 = obj instanceof InstanceOperator;
	    System.out.println("obj is an instance of Main: " + result2);

	}

}
