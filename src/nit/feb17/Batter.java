package nit.feb17;

public class Batter 
{
	String Name;
	int Runs;
	int Mathes;
	float Batting_Avg;
	public Batter(String name, int runs, int mathes) {
		super();
		Name = name;
		Runs = runs;
		Mathes = mathes;
	}
	void computeBatterAvarage()
	{
		if(Mathes==0&&Runs>=0)
		{
			System.out.println("Error");
		}
		else 
		{
		Batting_Avg=Runs/Mathes;
		System.out.println("Name :"+Name);
		System.out.println("Batting_Avg :"+Batting_Avg);
		}
		
	}
	
}
