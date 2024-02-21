package day56may;

import java.util.function.Function;

public class Example10 {

	public static void main(String[] args) {
		Function<String,String> fun=str->str.substring(2,5);
		System.out.println(fun.apply("abhishek"));

	}

}
