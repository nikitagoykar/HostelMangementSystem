package arrayassignments;
/*7. Create a Java code to copy an Array into another array. [Solution: Java Code to Copy Array
into*/

import java.util.*;

class CopyArrray
{  
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 
         int i,n;
 System.out.println("Enter the size of array x");
 n = sc.nextInt();
 
 int[] x = new int[n];
 int y[] = {1 ,2, 3, 4, 5, 6, 7, 8, 9, 10}; 
 int dest_arr[] = y,start_index = 4,dest_index = 2,length = 5; 
 
     System.out.println("Enter the elements of source_array(x)") ;
     for(i=0;i<n;i++)
     { 
       x[i] = sc.nextInt();
     
 }
 
     System.out.println("Elements of source_array(x) are :-");
     for(i=0;i<n;i++)
     { 
      System.out.print(x[i]+" ");
 }
 
     System.out.println("\n\nElements of dest_arr(y) are :-");
     for(i=0;i<n;i++)
     { 
      System.out.print(y[i]+" ");
 }
     System.out.println("\n");
 System.arraycopy(x ,start_index, dest_arr, dest_index, length);
     	System.out.println(length+" elements will be copied from start_index("+start_index+") of source_array(x)");
     	System.out.println("Into dest_arr(y) from dest_start_index("+dest_index+")");
     	System.out.println("\nElements of dest_arr(y) after copying from source_array(x) are:-");
     for(i=0;i<dest_arr.length;i++)
     { 
      System.out.print(dest_arr[i]+" ");
 }
  	} 
}