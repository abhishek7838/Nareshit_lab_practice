package day56may;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Example11 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(5);
		list.add(22);
		list.add(34);
		list.add(3);
		Consumer<Integer> con=arr->{
		  System.out.println(arr);
		};
		list.forEach(con);
		list.add(100);
		list.forEach(con);
	}

}
