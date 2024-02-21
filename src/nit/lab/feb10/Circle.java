package nit.lab.feb10;

public class Circle {
	public static String getArea(double r)
	{
		double pi=3.141;
		double area=pi*r*r;
		if(area<=0)
			return ""+0;
		else
		return " "+area;
		
	}

}
