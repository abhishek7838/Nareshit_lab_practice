package day56may;

interface Cource
{
	String name();
	String facultyName();
	String duration();
}
interface Nit 
{
	String nit(String name);
}
public class Exampe4 {

	public static void main(String[] args) 
	{
		Nit n=(String na)->na;
		System.out.println(n.nit("Abhi"));
		

	}

}
