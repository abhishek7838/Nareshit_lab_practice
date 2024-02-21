package test.feb11;

public class GoldBachNum {
	public static boolean getPrimeNum(int n)
	{   
		int i,c=0;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
				c++;
		}
		if(c==2)
		{
			return true;
		}
		else
			return false;		
	}
	public void isEvenNum(int N)
	{
		int i;
		if(N>9&&N<80)
		{
			if(N%2==0)
			{
				for(i=3;i<=N/2;i++)
				{
					int a=i;
					int b=N-i;
					if(getPrimeNum(a)&&getPrimeNum(b))
						System.out.println(a+"+"+b+" = "+N);
				}
			}
			else
				System.out.println("NUMBER IS ODD.");
		}
		else
			System.out.println("NUMBER IS INVALID.");

	}

	public static void main(String[] args) 
	{
		new GoldBachNum().isEvenNum(30);
	}
}
