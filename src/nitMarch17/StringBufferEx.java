package nitMarch17;

public class StringBufferEx {

	public static void main(String[] args) {
		long x=System.currentTimeMillis();
		StringBuffer sb=new StringBuffer("abhishek");
		for(int i=0;i<100000;i++)
		{
			sb.append("india");
		}
		long y=System.currentTimeMillis();
		
		System.out.println("Time Taken By StringBuffer:"+(y-x)+"ms");
		StringBuilder sbd=new StringBuilder("abhishek");
		for(int i=0;i<100000;i++)
		{
			sbd.append("javac");
		}
		long z=System.currentTimeMillis();
		System.out.println("Time Taken By StringBuilder"+(z-x)+"ms");

	}

}
