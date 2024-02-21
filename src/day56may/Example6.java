package day56may;

interface Nit2
{
	String get(String str);
}
public class Example6 {

	public static void main(String[] args)
	{
		Nit2 n=str->str+"welcome to";
		Nit2 n2=str->str+"NareshIt";
		information("java",n);
		information("python",n2);

	}
	public static void information(String s,Nit2 ob)
	{
		String result=ob.get(s);
		System.out.println(result);
	}

}
