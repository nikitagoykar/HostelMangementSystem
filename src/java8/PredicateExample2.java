package java8;
//Q2. Find out all the number which is greater than 5 in the given array.*/
import java.util.function.Predicate;


public class PredicateExample2
{
public static void main(String[] args)
{
int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
Predicate<Integer> even = x -> x % 2 == 0;

Predicate<Integer> grt = y -> y > 5;
for (int i : num)
{
if (grt.or(even).test(i))
{
System.out.println(i);
}
}
}
}