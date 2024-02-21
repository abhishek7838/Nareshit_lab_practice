package nit.feb22;

public class Test23 {
	static {
		System.out.println("SB1 X : "+x);
		}
		static int x = 10;
		static {
		x = 20;
		System.out.println("SB2 X : "+x);
		}
		public static void main(String[] args) {
		//no-operation
		}


}
