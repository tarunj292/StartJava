public class Balance
{
	private String name;
	private double balance;
	public Balance(String name, double balance)
	{
        	this.name = name;
        	this.balance = balance;
	}
	public void display()
	{
        	System.out.println("Name: " + name);
        	System.out.println("Balance: $" + balance);
        	if (balance < 0)
		{
            		System.out.println("Balance is less than 0");
        	}
    	}

}