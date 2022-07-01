package basic;
import java.util.Scanner;

public class Prime
{
	public static void main(String[]args)
	{
		int temp;
		boolean isPrime=true;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no");
		int num= sc.nextInt();
		for(int i=2;i<=num/2;i++)
		{
			temp=num%i;
			if(temp==0)
			{
				isPrime=false;
				break;
			}
		}
		
		if(isPrime)
		{
			System.out.println("no is prime");
			
		}
		else
		{
			System.out.println("no is not prime");
		}
	}
	}