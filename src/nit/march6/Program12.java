package nit.march6;

public class Program12
{
	public boolean ifContains(int arr[])
	{
		if(arr[0]!=2||arr[1]!=3||arr[1]==2||arr[0]!=3)
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int input[]= {2,3};
		Program12 p=new Program12();
		boolean result=p.ifContains(input);
		System.out.println(result);
	}

}
