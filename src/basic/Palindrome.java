package basic;

public class Palindrome {
	public static void main(String args[]) {

		String string = "Kakak";
		boolean flag = true;

		// Converts the given string into lowercase
		string = string.toLowerCase();

		// Iterate the string forward and backward, compare one character at a time
		// till middle of the string is reached
		for (int i = 0; i < string.length() / 2; i++) {
			if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println("Given string is palindrome");
		else
			System.out.println("Given string is not a palindrome");
	}
}

/*
 * int r,sum=0,temp; int n=454;//It is the number variable to be checked for
 * palindrome
 * 
 * temp=n; while(n>0){ r=n%10; //getting remainder sum=(sum*10)+r; n=n/10; }
 * if(temp==sum) System.out.println("palindrome number "); else
 * System.out.println("not palindrome"); }
 */
