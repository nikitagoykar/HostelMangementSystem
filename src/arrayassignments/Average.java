package arrayassignments;
//1. Java Program to find average of an int Array. [ Solution Program : Calculate Average of Array
//Elements in Java ]
import java.util.Scanner;
public class Average
{
  public static void main(String args[])	
  {
	  Scanner input=new Scanner(System.in);
	  System.out.println("enter the size of array");
	  int n=input.nextInt();
	  double total=0;
	  double array[]=new double[n];
	  System.out.println("enter the numbers");
	  for(int s=0;s<array.length;s++)
	  {
		  array[s]=input.nextDouble();
	  }
	  for(int i=0;i<array.length;i++)
	  {
		  total=total+array[i];
	  }
		 double average=total/n;
		 System.out.println("averaage \n"+average);
  }
  
}