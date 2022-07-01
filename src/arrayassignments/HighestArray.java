package arrayassignments;
/*6. Write a Java Program to find the second highest value in a numeric array. [Solution: Java
program to find second largest number in an array ]*/

import java.util.*;
 
class HighestArray
{  
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 
         int i,n,large;
 
 System.out.println("Enter the number of elements:") ;
 n = sc.nextInt();
 int[] a = new int[n];
 
     System.out.println("Enter the elements") ;
     for(i=0;i<n;i++)
     {
         a[i] = sc.nextInt();
     }
 
 large = a[0];    
 for(i=1;i<n;i++)
     	{
 if(large<a[i])
         {
 large = a[i];
 }
     }
     
 System.out.println("Largest of "+n+" elements in an array = "+large);
 }
}

