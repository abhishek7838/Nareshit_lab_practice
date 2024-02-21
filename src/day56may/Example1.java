package day56may;

import java.util.function.BiFunction;

public class Example1 {

	public static void main(String[] args) 
	{
		BiFunction<String,String,Boolean> camp=(a,b)->a.equals(b);
		System.out.println(camp.apply("Java","Java"));
		

	}

}
