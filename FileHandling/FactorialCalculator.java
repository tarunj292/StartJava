/*Wap to accept a long integer number from the user and find its factorial. If the number is negative or larger than 10, raise and handle an exception by providing your own exception class.*/
import java.util.Scanner;
class FactorialCalculator
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		long num = sc.nextInt();
		try
		{
			if(num<0 || num>10)
				throw new InvalidNumberException("Please enter a positive long number smaller than 11");
			long factorial = fact(num);
			System.out.println(factorial);
		}
		catch(InvalidNumberException e)
		{
			System.out.println(e);
		}
	}
	public static long fact(long num)
	{
		long facto = 1;
		for(int i = 1; i<=num; i++)
			facto*=i;
		return facto;
	}
}
class InvalidNumberException extends Exception
{
	public InvalidNumberException(String msg)
	{
		super(msg);
	}
}