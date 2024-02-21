package cakeprogramMarch27;

public class OrderedCake extends Cake
{
	private String message;

	public OrderedCake(String shape, String flavour, int qty) {
		super(shape, flavour, qty);
	}

	public OrderedCake(String shape, String flavour, int qty, String message) {
		super(shape, flavour, qty);
		this.message = message;
	}
	protected void showCake() 
	{
		if(message!=null) 
		{
			System.out.println("A round "+getFlavour()+"cake of "+getQty()+"readywith message "+message+" @ "+getPrice()+"/-\"");
			
		}
	}
	
	
	
	
	
}
