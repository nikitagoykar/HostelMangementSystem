package streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Sort
{
    

	public static void main(String[] args)
    {
    	List<Integer> list=Arrays.asList(-5,-8,0,7,4);
    	List<Integer> sortedlist=list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
    
    	System.out.println(sortedlist);
    
    }
}


