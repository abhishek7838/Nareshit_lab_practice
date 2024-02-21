package nit.lab.feb10;

import java.text.DecimalFormat;

public class Test {

	public static void main(String[] args) {
	String area = Circle.getArea(3);
	double d = Double.parseDouble(area);
	DecimalFormat df = new DecimalFormat("000.000");
	System.out.println(df.format(d));

	}

}
