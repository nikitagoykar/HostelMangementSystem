package arrayassignments;
/*5. Write a Java Program to remove a particular element from an array. [Solution : Program :
Remove an Element from int Array in Java]*/
import java.util.Scanner;

public class RmoveArray
{
   public static void main(String[] args)
   {
      int i, j, size=10, element;
      int[] arr = new int[size];
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter 10 Elements: ");
      for(i=0; i<size; i++)
         arr[i] = scan.nextInt();
      
      System.out.print("Enter the Element to Remove: ");
      element = scan.nextInt();
      
      for(i=0; i<size; i++)
      {
         if(element==arr[i])
         {
            for(j=i; j<(size-1); j++)
               arr[j] = arr[j+1];
            System.out.println("\nRemoved the element successfully!");
            break;
         }
      }
      
      System.out.println("\nThe new array is: ");
      for(i=0; i<(size-1); i++)
         System.out.print(arr[i]+ " ");
   }
}