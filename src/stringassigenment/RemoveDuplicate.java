//3. Write a Java program to print after removing duplicates from a given string. ( Welcome to Welcome)
package stringassigenment;
import java.util.*;
public class RemoveDuplicate {

	public static void main(String[] args) {
		String str1 ="Welcome To Welcome";
		  System.out.println("The given string is: " + str1);
		  System.out.println("After removing duplicates characters the new string is: " + removeDuplicateChars(str1));
		 }
		 private static String removeDuplicateChars(String sourceStr) {
		  char[] arr1 = sourceStr.toCharArray();
		  String targetStr = "";
		  for (char value: arr1) {
		   if (targetStr.indexOf(value) == -1) {
		    targetStr += value;
		   }
		  }
		  return targetStr;

	}

}
