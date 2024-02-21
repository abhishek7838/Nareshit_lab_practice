package nit.lab.feb_09;

public class Calculate {                 //BLC
	public static int squareAndCube(int a)
	{
		int n;
		if(a<=0)
		return -1;
		if(a%2==0)
		{
			 //n=a*a;
			n=Square(a);
			//return x;
		}
		else {
			 n=a*a*a;
		}
		return n;
				
		
		
	}
	public static int Square(int a) {
		 return a*a;
	}

}
