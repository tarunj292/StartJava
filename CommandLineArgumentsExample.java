/*Wap to accept a long integer number from the user and find its factorial. If the number is negative or larger than 10, raise and handle an exception by providing your own exception class.*/

class FactorialException extends Exception
{
	public FactorialException(String msg)
	{
		super(msg);
	}
}
class CommandLineArgumentsExample
{
	public static void main(String [] args)
	{
		try
		{
			long num = getInputNumber();
			if(num<0 || num>10)
			{
				throw new FactorialException("Input is negative or larger than 10");
			}
			long factorial = calculateFact(num);
			System.out.println("Factorial of " + num + " is " + factorial);
		}
		catch(FactorialException e)
		{
			System.out.println("Factorial Calculation Error: " + e.getMessage());
		}
	}
	private static long getInputNumber()
	{
		return 15;
	}
	private static long calculateFact(long n)
	{
		if(n==0)
			return 1;
		return n*calculateFact(n-1);
	}
}



































/* Wap to accept two numbers as command-line arguments. If the appropriate number of command-line arguments are not passed, then raise an ArrayIndexOutOfBoundsException and print an appropriate message. Also check if the command-line arguments are integers, if not then handle NumberFormatException.


class CommandLineArgumentsExample
{
	public static void main(String [] args)
	{
		try
		{
			if(args.length!=2)
			{
				throw new ArrayIndexOutOfBoundsException("Please Provide Exactly two command line arguments");
			}
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		System.out.println("Sum of the two numbers is "+(n1+n2));
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println("Error: "+e.getMessage());
		}
		catch(NumberFormatException e)
		{
			System.err.println("Error: Please provide valid integer arguments");
		}
	}
}*/