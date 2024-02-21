package nit.feb20;

public class Test7 {

	//static variable a
	 static int a = 20;
	 public static void main(String[] args)
	 {
	//write code here to access a variable with diff ways
		 System.out.println("identifier name :"+a);
		 System.out.println("class name :"+Test7.a);
		 System.out.println("class Object name :"+new Test7().a);
	 }
}
	