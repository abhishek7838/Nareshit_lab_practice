package nit.march3;

import java.util.*;
public class CustomerTest {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Customer Number :");
        int cno=sc.nextInt(); 
        System.out.println("Enter a Customer Name :");
        String cname=sc.nextLine();
        cname=sc.nextLine();
        System.out.println("Enter a Customer Address :");
        String add=sc.nextLine();
        System.out.println("Enter a customer Bill :");
        float bill=sc.nextFloat();
		Customer c=new Customer(cno,cname,add,bill);
		System.out.println(c);
		/*System.out.println("Customer Details :");
		System.out.println("Customer Number :"+customerNumber);
		System.out.println("Customer Name :");
		System.out.println("Customer Address :");
		System.out.println("Customer Bill:");*/
		sc.close();

	}

}
