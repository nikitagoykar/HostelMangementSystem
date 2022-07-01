package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



class Maps
{
	

	public static void main(String[] args)
{
     System.out.println("The stream after applying function"+"the function is :") ;
     List <Integer> list=Arrays.asList(2,4,6,8,10);
     list.stream().map(number->number*4).forEach(System.out::println);
}
	}