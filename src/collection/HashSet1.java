package collection;

import java.util.*;  
class HashSet1{  
 public static void main(String args[]){  
  //Creating HashSet and adding elements  
    HashSet<String> set=new HashSet<String>();  
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