package java8;

import java.util.function.Function;

public class functionalChaning
{

	public static void main(String[] args) 
	{
		int amount = 3;
		Function<Integer, Integer> sq = i -> i * i;// 3*3=9
		Function<Integer, Integer> sum = i -> i + i;// 3+3=6
		System.out.println(sum.apply(amount));// 6
		System.out.println(sq.apply(amount));// 9
		System.out.println(sum.andThen(sq).apply(amount));// 36
		System.out.println(sum.compose(sq).apply(amount));// 6*3
	}

}
