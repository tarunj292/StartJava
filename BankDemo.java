






































/*Design a class to represent a bank account. Include the following members:
Data members/fields:
• Name of the depositor
• Account Number
• Type of account
• Balance amount in the account
Methods
• To assign initial values
• To deposit an amount
• To withdraw an amount after checking balance
• To display the name and balance*/

class Bank
{
	String name;
	long acc_no;
	String acc_type;
	double bal;
	void setAccount(String name, long acc_no, String acc_type, double bal)
	{
		this.name = name;
		this.acc_no = acc_no;
		this.acc_type = acc_type;
		this.bal = bal;
	}
	void deposit(double amt)
	{
		bal+=amt;
		System.out.println("Rs. "+amt+" deposited to your account successfully");
	}
	void withdraw(double amt)
	{
		if(bal>=amt)
		{
			System.out.println("Rs. "+bal+" is the balance in your account");
			bal-=amt;
			System.out.println("Rs. "+amt+" withdrawn from your account successfully");
		}
		else
			System.out.println("insufficient balance, Try entering a smaller amount");
	}
	void getAccount()
	{
		System.out.println("Your name is "+name+"\n Rs. "+bal+" is the balance in your account");
	}
}
class BankDemo
{
	public static void main(String [] args)
	{
		Bank b = new Bank();
		b.setAccount("Tarun Joshi",12948,"Savings Account",70000);
		b.deposit(700);
		b.withdraw(100);
		b.getAccount();
	}
}