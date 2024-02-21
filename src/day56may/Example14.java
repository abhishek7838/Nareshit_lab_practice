package day56may;

import java.util.function.Predicate;

public class Example14 {

	public static void main(String[] args) {
		Predicate<Integer> grater=a->a>10;
		Predicate<Integer> less=b->b<20;
		boolean bool=grater.test(50);
		boolean bool2=less.test(50);
		System.out.println(bool);
		System.out.println(bool2);
	}

}
