package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
 public static void main(String args[]){  
   HashMap<String,String> map=new HashMap<String,String>();//Creating HashMap    
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