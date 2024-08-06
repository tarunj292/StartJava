/*Wap to accept two numbers as command-line arguments. If the appropriate number of command-line arguments are not passed, then raise an ArrayIndexOutOfBoundsException and print an appropriate message. Also check if the command-line arguments are integers, if not then handle NumberFormatException*/
class AddTwoNumbers
{
	public static void main (String [] args)
	{
		try
		{
			if(args.length!=2)
				throw  new ArrayIndexOutOfBoundsException("Please provide exactly two command-line arguments.");
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println("Sum is " + (a+b));
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
	}
}