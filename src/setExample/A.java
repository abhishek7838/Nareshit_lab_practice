package setExample;


public class A {

	void m()
	{
		System.out.println("ClassA meth1");
	}
}
public class ClassB 
	{
		public static void main(String[] args)
		{
			new ClassB().go();
		}
	
	void go()
	{
		new A().m();
		class A
		{
			void m()
			{
				System.out.println("go meth class M");
			}
		}
	}
  class A{
	  void m()
	  {
		  System.out.println("outer Class A Method M");
	  }
	  }
  }
