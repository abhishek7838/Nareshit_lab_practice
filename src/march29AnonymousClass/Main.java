package march29AnonymousClass;

public class Main {

	public static void main(String[] args)
	{
		Printable p=new Printable()
		{
			public void print()
			{
				System.out.println("printing Anonymous Class");
			}	
		};p.print();
		

	}

}
