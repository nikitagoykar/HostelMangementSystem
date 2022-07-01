package java8;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class OptionalExample {

	public static void main(String[] args) {
		/*
		 * String[] str = new String[10]; String lowercaseString = str[5].toLowerCase();
		 * System.out.print(lowercaseString);
		 */

		/*
		 * String[] str = new String[10]; Optional<String> checkNull =
		 * Optional.ofNullable(str[5]); if(checkNull.isPresent()){ // check for value is
		 * present or not String lowercaseString = str[5].toLowerCase();
		 * System.out.print(lowercaseString); }else
		 * System.out.println("string value is not present");
		 * 
		 */

		/*
		 * Optional.empty() returns an empty Optional.
		 */
		Optional<Object> emptyOptional = Optional.empty();
		/*
		 * Optional.of("Peter") returns non empty Optional. If value is null, will get
		 * NPE
		 */
		Optional<String> nonEmptyOptional = Optional.of("Delhi");
		/*
		 * Optional.ofNullable("Peter") returns non empty Optional. If value is null,
		 * will get Optional.empty()
		 */
		Optional<String> nonEmptyOrEmptyOptional1 = Optional.ofNullable("India");
		Optional<Object> nonEmptyOrEmptyOptional2 = Optional.ofNullable(null);

		System.out.println(emptyOptional);
		System.out.println(nonEmptyOptional);
		System.out.println(nonEmptyOrEmptyOptional1);
		System.out.println(nonEmptyOrEmptyOptional2);

		Optional<String> emptyOptional1 = Optional.empty();
		System.out.println(emptyOptional1);// Optional.empty

		Optional<String> nonEmptyOptional1 = Optional.of("Peter Milanovich");
		Optional<Object> emptyOptional11 = Optional.empty();

		System.out.println(emptyOptional11.isPresent());// false
		System.out.println(nonEmptyOptional1.isPresent());// true

		Predicate<? super Object> predicate = s -> ((String) s).contains("Milanovich");
		System.out.println(nonEmptyOptional.filter(predicate));// Optional[Peter Milanovich]
		System.out.println(nonEmptyOptional.filter(s -> s.equals("Peter")));// Optional.empty
		System.out.println(emptyOptional.filter(predicate));// Optional.empty
		System.out.println(nonEmptyOptional.filter(s -> s.startsWith("P")));// Optional[Peter Milanovich]

		Function<String, String> function = s -> s.substring(0, 0).length() == 0 ? null : s;

		System.out.println(nonEmptyOptional.map(function));// Optional.empty
		System.out.println(nonEmptyOptional.map(String::toLowerCase));// Optional[peter milanovich]
		// System.out.println(emptyOptional.map(function));// Optional.empty

	}

}
