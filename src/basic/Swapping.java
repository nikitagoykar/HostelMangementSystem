package basic;

public class Swapping {

	public static void main(String[] args) {
		String a="nikita";
		String b="goykar";
		System.out.println("string before swap: "+a+" "+b);
	
		 a=a+b;
		 b=a.substring(0,a.length()-b.length());
		 a=a.substring(b.length());
		System.out.println("string after swap: "+a+" "+b);
	}

}
