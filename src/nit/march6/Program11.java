package nit.march6;

public class Program11 
{
	public boolean ifcontains(int arr[])
	{
		if(arr[0]==2||arr[1]==3||arr[0]==3||arr[1]==2)
		{
			return true;
		}
		else
			return false;
	}
	public static void main(String[] args) {
		int input1[]= {6,3};
		Program11 p=new Program11();
		boolean result=p.ifcontains(input1);
		System.out.println(result);
	}
}
