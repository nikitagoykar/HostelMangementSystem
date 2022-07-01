package string;

public class StringDemo {

	public static void main(String[] args) {
		String s1=new String();//empty string
		System.out.println("s1= " +s1);
		
		char[] arr= {'a','b','c','d','e','f','g'};//contsins string
		String s2=new String(arr);
		System.out.println("s2 =" +s2);
		
		String s3=new String(s2);
		if(s2==s3)//compairs address of string
		System.out.println("s2 and s3 are equal ");
		
		if(s2.equals(s3))//compaire the value
		System.out.println("s2 and s3 are equal reference");	
		
		System.out.println(s2 +" strartWith abc ="+s2.startsWith(" abc "));//return boolean value true

		System.out.println(s2 +" endWith efg ="+s2.endsWith(" efg "));//return boolean value true
		
		String s4="this is orignal";
		System.out.println("s4 ="+s4);//check original 
		
		System.out.println("after replacing i by x");//replace the value 
		String s5=s4.replace('i','x');
		
		System.out.println("s4 ="+s4);
		System.out.println("s5 ="+s4);
		
		String txt = "  Hello World ";
		System.out.println(txt.toUpperCase());
		System.out.println(txt.toLowerCase());
		System.out.println(txt.trim());
		
		String s6="INDIA";  
		System.out.println("string length is: "+s6.length());//5 is the length of string  
	}
}
