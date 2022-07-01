package project;
/*------------------------JAVA 8 FEATURES----------------------------------------------------

1. Java 8 Filter Example: Counting Empty String
   List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");

2.Count String whose length is more than three

3. Count number of String which starts with "a"

4.Java 8 Collectors Example: Remove all empty Strings from List

5. Create a List with String more than 2 characters

6. Convert String to uppercase and Join them with coma

7.Create a List of the square of all distinct numbers

8. Get count, min, max, sum, and the average for numbers
List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);*/

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Ass1 {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");

		long str = strList.stream().filter(s -> s.isEmpty()).count();
		System.out.println(strList);

///2
		long num = strList.stream().filter(s -> s.length() > 2).count();
		System.out.println(num);

//3
		long count1 = strList.stream().filter(s -> s.startsWith("a")).count();
		System.out.println(count1);
//4
		List<String> filtered = strList.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
		System.out.println(filtered);

/// 5
		List<String> filtered1 = strList.stream().filter(s -> s.length() > 2).collect(Collectors.toList());
		System.out.println(filtered1);

///6	
		List<String> s1= Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
		String Countries = s1.stream().map(s-> s.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println(Countries );

///7		
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		List<Integer> distinct = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
		System.out.println(distinct );

//8		
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
		IntSummaryStatistics stats = primes.stream().mapToInt((s) -> s).summaryStatistics();
		System.out.println(stats);

	}
}