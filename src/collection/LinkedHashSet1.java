package collection;

import java.util.*;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		
		LinkedHashSet<String> set=new LinkedHashSet<String>();  
           set.add("AB");    
           set.add("ED");    
           set.add("AA");   
           set.add("XZ");  
           set.add("MN");  
           Iterator<String> i=set.iterator();  
           while(i.hasNext())  
           {  
           System.out.println(i.next());  
           }  
 }  
}  
//maintains the original order