package areaofSqandANGmarch27;

import java.util.*;
public class Test {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number : ");
		int num=sc.nextInt();
		Square sq=new Square(num);
		System.out.println("Area of Square is :"+sq.areaOfSquare());
		System.out.println("enter a length ");
		int length=sc.nextInt();
		System.out.println("enter a breadth : ");
		int breadth=sc.nextInt();
		Ractangle ar=new Ractangle(length,breadth);
		System.out.println("Area of ractAngle : "+ar.areaOfRactangle());
		sc.close();
		
		

	}

}
