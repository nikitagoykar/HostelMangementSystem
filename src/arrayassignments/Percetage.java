package arrayassignments;
import java.util.Scanner;
public class Percetage {
	public static void main(String[] args)
	{
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("How many students marks you want to insert ");
	int n = sc.nextInt();  //5
	
	int marks[]  = new int[n];
	System.out.println("Enter the marks of "+n+" students");
	for(int i=0;i<marks.length;i++)
	{
		  marks[i] =  sc.nextInt();
	}
	
	System.out.println("--------------------------");
	
	System.out.println("Marks are ---");
	for(int i=0;i<marks.length;i++)
	{
		  System.out.println("Marks of   "+i+" students is  "+marks[i]);
	}
}
}