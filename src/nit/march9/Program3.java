package nit.march9;

public class Program3 
{
	static int c=0;
	public static String getOddCount(int arr[])
	{
		
		if(arr.length<=5)
			return "-1";
		
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]<0)
					return "-2";
				else {
					if(arr[i]%2!=0)
						c++;
				}
				
			}
		if(c==0)
			return "-2";
		return Integer.toString(c);
	}
		

	public static void main(String[] args) {
		int input1[]= {5,7,3,7,8,6};
		String result=getOddCount(input1);
		System.out.println(result);

	}

}
