package nit.feb.f10;

public class Calculate {
	public void checkSpyNum(int n)
	{
		int s=0;
		int m=1;
		while(n!=0)
		{
			int a=n%10;
			s+=a;
			m*=a;
			n=n/10;
			
		}
		if(s==m)
			System.out.println("SPY");
		else
			System.out.println("SPY");
	}
	
}


