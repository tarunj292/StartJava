class BasicExample
{
	public static void main(String [] args)
	{
		try
		{
			int res = divideNumber(5,0);
			System.out.println("TResult is " + res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error: " + e.getMessage());
		}
	}
	public static int divideNumber(int dividend, int divisor)
	{
		if(divisor==0)
			throw new ArithmeticException("Cannot divide the given numbere by zero");
		return dividend/divisor;
	}
}