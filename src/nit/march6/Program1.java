package nit.march6;

public class Program1 
{
	public boolean checkFirstLast(int arr[])
	{
		if(arr.length>=1&&arr[0]==6||arr[arr.length-1]==6)
			return true;
		    return false;
	}
	public static void main(String[] args) 
	{
		Program1 p=new Program1();
		int input[]= {6,87,6};
		p.checkFirstLast(input);
		boolean b=p.checkFirstLast(input);
		System.out.println(b);
	}
}
