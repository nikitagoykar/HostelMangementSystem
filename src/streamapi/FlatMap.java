package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class FlatMap
{
 public static void main(String[] args)	
 {
	 List<String> list=Arrays.asList("11","10.5","45","50");
	 list.stream().flatMap(number->Stream.of(number)).forEach(System.out::println);
 }


}