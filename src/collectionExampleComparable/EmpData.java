package collectionExampleComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmpData {

	public static void main(String[] args)
	{
		ArrayList<ClassA> al=new ArrayList<ClassA>();
		al.add(new ClassA(333,"virat",40000));
		al.add(new ClassA(555,"abirat",10000));
		al.add(new ClassA(111,"siraj",50000));
		al.add(new ClassA(444,"brave",30000));
		
		Comparator<Integer> desc=(e1,e2)-> -(e1-e2);
		Collections.sort(al,desc);
		al.forEach(System.out::println);
		
		

	}

}
