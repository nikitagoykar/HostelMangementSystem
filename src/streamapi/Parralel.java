package streamapi;

import java.util.Arrays;

public class Parralel
{
	public static void main(String[] args)
	{
		int arr[]= {10,20,30,40,50};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
			Arrays.parallelSort(arr);
			for(int j=0;j<arr.length;j++)
			{
				System.out.println(arr[j]+" ");
			}
			
		}
	}
	}