package nit.march6;

public class Program2 
{
	public boolean equalFirstLast(int arr2[])
	{
		if(arr2.length>=1&&arr2[0]==arr2[arr2.length-1])
			return true;
		    return false;
	}
	public static void main(String[] args) {
		Program2 p1=new Program2();
		int inp2[]= {7,3,6,9,8};
		boolean b1=p1.equalFirstLast(inp2);
		System.out.println(b1);
	}
}
