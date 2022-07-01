package java8;

import java.util.function.Predicate;

public class PredicateExample3 {
	public static void main(String[] args) {
		Predicate<String> name = Predicate.isEqual("Mumbai");
		System.out.println(name.test("Mumbai"));
	}
}
