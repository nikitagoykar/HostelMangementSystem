package collection;
import java.util.*; 
public class Vector1 {

	public static void main(String[] args) {
          //Create a vector  
          Vector<String> vec = new Vector<String>();  
          //Adding elements using add() method of List  
          vec.add("Ram");  
          vec.add("karan");  
          vec.add("riya");  
          vec.add("jiya");  
          //Adding elements using addElement() method of Vector  
          vec.addElement("kaira");  
          vec.addElement("mayra");  
          vec.addElement("pinku");  
            
          System.out.println("Elements are: "+vec); 
          Collections.sort(vec);
  		System.out.println("sorted vector:"+vec);
  		vec.remove(2);
  		System.out.println("updated vector:"+vec);
       }  
}  