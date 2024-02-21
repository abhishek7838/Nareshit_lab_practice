package nit.feb22;

public class Test20 {
	int x =100;
	static {
	int x = 200;
	System.out.println("SB X : "+x);
	}
	static void m1() {
	x = 300;
	System.out.println("m1 X :"+x);
	}
	public static void main(String []args) {
	System.out.println("main X :"+x);
	}

}
