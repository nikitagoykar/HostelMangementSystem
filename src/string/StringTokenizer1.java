package string;

import java.util.StringTokenizer;  
public class StringTokenizer1
{  
 public static void main(String args[])
 {  
   StringTokenizer st = new StringTokenizer("India is my country ."," ");  
     while (st.hasMoreTokens()) {  
         System.out.println(st.nextToken());  
         
        
     }  
   }  
}  