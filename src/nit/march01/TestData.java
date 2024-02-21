package nit.march01;
import java.util.*;
public class TestData {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int[] arr=new int[a];
		for(int i=0;i<a;i++) {
			System.out.println("Element-"+i);
			arr[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(arr));

	}

}
