package collection;
import java.util.*; 
public class TreeSet1 {

	public static void main(String[] args) {
		
	
  TreeSet<String> ts=new TreeSet<String>();  
  ts.add("Ram");  
  ts.add("Viram");  
  ts.add("Ravi");  
  ts.add("Aarya");  
  //Traversing elements  
  Iterator<String> itr=ts.iterator();  
  while(itr.hasNext()){  
	  System.out.println("Elements are: "); 
   System.out.println(itr.next());  
    
  
	
  }  
 }  
}  