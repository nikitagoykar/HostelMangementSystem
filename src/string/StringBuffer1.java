package string;

public class StringBuffer1 {

	public static void main(String[] args) 
	{
		StringBuffer str = new StringBuffer("Object Language");
		System.out.println("Original String :"+str);
		// Obtaining string Length
		System.out.println("Length of string " +str.length());
		//Accessing character in string
		for(int i=0;i<str.length();i++)
		{

		int p = i+1;

		System.out.println("Characters at position : "+p+" is "+str.charAt(i));
		}

		
		// inserting a string in the middle
		String str2 = new String(str.toString());
		
		int pos = str2.indexOf("Language");
		str.insert(pos,"Oriented");
		
		System.out.println("Modified String :"+str);
		
		// Modifying Character
		
		str.setCharAt(6,'-');
		System.out.println("String Now : "+str);
		
		// Appending a string at the end
		
		str.append("Improve Security ");
		System.out.println("Append String "+str);
		
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.insert(1,"Java");//now original string is changed  
		System.out.println(sb);//prints HJavaello  
		
		sb.delete(1,3);  
		System.out.println(sb);//prints Hvaello  
		
		sb.reverse();  
		System.out.println(sb);//prints ollevaH 

		}

		}

		

