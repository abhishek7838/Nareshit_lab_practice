package nit.march6;

public class Program3
{
	public boolean twoArraysElement(int a[],int b[])
	{
		if(a.length>=1&&b.length>=1&&a[0]==b[0]||a[a.length-1]==b[b.length-1])
			return true;
		    return false;
	}
	public static void main(String[] args) 
	{
		Program3 p3=new Program3();
		int input3[]= {7,63,8,4};
		int input4[]= {6,5,7,4};
		boolean b3=p3.twoArraysElement(input3, input4);
		System.out.println(b3);
	}
}
