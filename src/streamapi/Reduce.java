package streamapi;

import java.util.Arrays;
import java.util.Optional;

class Reduce
{
   public static void main(String[] args)	
   {
	   String[] array= {"Welcome","To","Edubridge"};
	   Optional<String> String_combine=Arrays.stream(array).reduce((str1,str2)->str1+"-"+str2);
	   if(String_combine.isPresent())
	   {
		   System.out.println(String_combine.get());
	   }
   }
}
