class TryCatch
{
	public static void main(String [] args)
	{
		int a[] = new int[3];
		int b = 1;
		String name = "Sejal";
		String s = null;
		try
		{
			b=18/b;
			System.out.println(a[1]);
			System.out.println(a[0]);
			System.out.println(name.charAt(0));
			System.out.println(s);
			int m = Integer.parseInt("5");
			//Class.forName("Tarun_java.Box");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e)
		{
			System.out.println("Its Empty " + e.toString());
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e.toString());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println(b);
	}
}