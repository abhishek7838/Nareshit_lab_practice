package lab.febexa;

public class Test 
{
	public static void main(String[] args) {
		Demo d2=new Demo();
		System.out.println("main called");
		Demo d=new Demo();
		System.out.println(Foo.x);
	}

}
class Foo
{
	static int x=10;
	static {
		System.out.println(x);
	}
	
}
