package nit.march3;

public class Customer 
{
	private int customerNumber;
	private String customerName;
	private String customerAddress;
	private double customerBill;
	public Customer(int customerNumber, String customerName, String customerAddress) {
		super();
		this.customerNumber = customerNumber;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}
	public Customer(int customerNumber, String customerName, String customerAddress, double customerBill) 
	{
		this(customerNumber,customerName,customerAddress);
		this.customerNumber = customerNumber;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerBill = customerBill;
		
	}
	@Override
	public String toString() {
		return "Customer Details :"+"\n"+"Customer-Number=" + customerNumber +"\n"+ "CustomerName=" +customerName+"\n"+"CustomerAddress="
				+customerAddress +"\n"+"CustomerBill="+customerBill;
	}
	
}
