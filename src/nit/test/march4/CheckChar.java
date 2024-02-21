package nit.test.march4;
 
import java.util.*;
public class CheckChar 
{
	public void checkCharecter(char c)
	{
		if(97<=c&&122>=c||65<=c&&91>=c)
		{
			switch(c)
			{
			case 97: System.out.println(c+" charecter is a Vowel");break;
			case 101: System.out.println(c+" charecter is a Vowel");break;
			case 105: System.out.println(c+" charecter is a Vowel");break;
			case 111: System.out.println(c+" charecter is a Vowel");break;
			case 117: System.out.println(c+" charecter is a Vowel");break;
			case 65: System.out.println(c+" charecter is a Vowel");break;
			case 69: System.out.println(c+" charecter is a Vowel");break;
			case 85: System.out.println(c+" charecter is a Vowel");break;
			default : System.out.println(c+" charecter Consonant");break;
			}
		}
		else 
			System.out.println("Invalid");
			
		
		
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Charecter of ASCII value :");
		 char b=sc.next().charAt(0);
		CheckChar abo=new CheckChar();
		abo.checkCharecter(b);
		sc.close();
		
		
		

	}

}
