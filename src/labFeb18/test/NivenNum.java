package labFeb18.test;

public class NivenNum 
{
	void niven(int n)
	{
		int sum=0;
		int temp=n;
		while(temp!=0)
		{
			int a=temp%10;
			sum+=a;
			temp=temp/10;
		}
		if(n%sum==0)
			System.out.println("Niven Nume");
		else
			System.out.println("not Niven Nume");
	}

	public static void main(String[] args) 
	{
		new NivenNum().niven(101);
		
	}

}
