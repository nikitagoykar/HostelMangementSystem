package collection;

import java.util.TreeMap;
import java.util.Map;

public class TreeMap1 {
 public static void main(String args[]){  
	 TreeMap<String,String> map=new TreeMap<String,String>();   
   map.put("INDIA","Mango");  //Put elements in Map  
   map.put("US","Apple");    
   map.put("CHINA","Banana");   
   map.put("RUSSIA","Grapes");   
       
   System.out.println("Iterating Hashmap...");  
   for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }  
}  
}  