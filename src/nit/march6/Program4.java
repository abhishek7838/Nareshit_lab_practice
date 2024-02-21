package nit.march6;

public class Program4 
{
	public int sumofArrayElement(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
			sum+=arr[i];
		return sum;
	}
	public static void main(String[] args) 
	{
		Program4 p4=new Program4();
		int input[]= {1,7,3};
		int result=p4.sumofArrayElement(input);
		System.out.println("Sum of three Element :"+result);	
	}
}
