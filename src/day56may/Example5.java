package day56may;

import java.util.function.Function;

public class Example5 {

	public static void main(String[] args)
	{
		Function<String,Boolean> fun=str->str.startsWith("A");
		System.out.println(fun.apply("Bbhi"));

	}

}
