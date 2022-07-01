package arrayassignments;
/*2. Create a Java Program to Sort an Array of Numeric or String Data. [Solution : Program : Sort
an Array in Java]*/
import java.util.Scanner;
public class SortArray
{
	public static void main(String[] args) 
	{
	int count,temp;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array");
	count=sc.nextInt();
	int num[]=new int[count];
	System.out.println("enter the elemts");
	for(int i=0;i<count;i++)
	{
		num[i]=sc.nextInt();
		}
	sc.close();
	for(int i=0;i<count;i++)
	{
		for(int j=i+1;j<count;j++)
		{
			if(num[i]>num[j])
			{
				temp=num[i];
				num[i]=num[j];
				num[j]=temp;
			}
		}
	}
	System.out.println("sorted array");
	for(int i=0;i<count-1;i++)
	{
		System.out.println(num[i]);
	}
	System.out.println(num[count-1]);
	}

}
