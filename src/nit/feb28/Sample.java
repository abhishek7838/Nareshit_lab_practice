package nit.feb28;

public class Sample 
{
	private Integer i1=900;

	public static void main(String[] args) 
	{
		Sample s1=new Sample();
		Sample s2=new Sample();
		Sample s3=modify(s2);
		s1=null;
		System.out.println(s2.i1);

	}
	public static Sample modify(Sample s)
	{
//		s.i1=9;
		//s=new Sample();
//		s.i1=20;
		s=new Sample();
		s=null;
		return s;
	}

}
