class OddNumber
{
	public static void main(String [] args)
	{
		int n = 10;
		trynumber(n);
		n = 7;
		trynumber(n);
	}
	static void trynumber(int n)
	{
		try
		{
			checkEvenNumber(n);
			System.out.println(n + " is Even.");
		}
		catch (IllegalArgumentException e)
		{
			System.out.println("Error: " + e.getMessage());
		}
	}
	static void checkEvenNumber(int n)
	{
		if(n%2!=0)
			throw new IllegalArgumentException(n + " is Odd.");
	}
}