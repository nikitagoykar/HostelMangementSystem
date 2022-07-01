/*7. Write a Java program to count how many times the substring 'life' present at 
anywhere in a given string. 

Sample Output:

The given string is: liveonwildlife
appear number of times: 1*/

package stringassigenment;

public class StringAppear {
	public int substringCounting(String stng) 
	{
	  int l = stng.length();
	  int ctr = 0;
	  String firsttwo = "li";
	  String lastone = "e";
	  if (l < 4)
	    return 0;
	  for (int i = 0; i < l - 3; i++) 
	  {
	    if (firsttwo.compareTo(stng.substring(i,i+2)) == 0 && lastone.compareTo(stng.substring(i+3, i+4)) == 0)
	      ctr++;
	  }
	  return ctr;
	}

	public static void main(String[] args) {
		
		StringAppear m= new StringAppear();
	      String str1 =  "liveonwildlife";
	      System.out.println("The given string is: "+str1);
	      System.out.println("The substring life or life appear number of times: "+m.substringCounting(str1));
	}

}
