package streamapi;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Comparator {

	// Driver code
	public static void main(String[] args)
	{

		List<Integer> list = Arrays.asList(10, 23, -4, 0, 18);
		List<Integer> sortedList = list.stream()
		        .sorted(Collections.reverseOrder())
		        .collect(Collectors.toList());

		System.out.println(sortedList);
	}
}
