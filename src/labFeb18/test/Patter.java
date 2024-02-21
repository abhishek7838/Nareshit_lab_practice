package labFeb18.test;

public class Patter 
{
	void pattern(int n)
	{
		int r,c;
		for(r=1;r<=n;r++)
		{
			for(c=r;c>0;c--)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) 
	{
		new Patter().pattern(5);
		 

	}

}
