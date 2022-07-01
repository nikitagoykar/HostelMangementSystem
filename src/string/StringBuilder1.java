package string;

public class StringBuilder1 { 
    public static void main(String[] args) {  
          StringBuilder sb1 = new StringBuilder("value1 ");  
          System.out.println("builderObject :"+sb1);  
          
       // appending boolean argument  
          sb1.append(true);  
          
          // print the StringBuilder after appending  
          System.out.println("after append = " + sb1);  
  
          StringBuilder sb2 = new StringBuilder("value2 ");  
          System.out.println("new builderObject :" + sb2);  
            
          // appending boolean argument      
          sb2.append(false);  
            
          // print the string Builder after appending  
          System.out.println("after append = " + sb2);  
    }  
  
}  