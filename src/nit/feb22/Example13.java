package nit.feb22;

public class Example13 {
	static {
		System.out.println("Static Block");
		System.out.println(Example13.a);
		}
		public static void main(String[] args) {
		System.out.println("Main Method");
		System.out.println(a);
		}
}
