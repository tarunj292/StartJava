import java.io.*;
class CreateFile
{
	public static void main(String [] args)
	{
		File myFile = new File("C:\\Tarun_java\\FileHandling\\FirstFile.txt");
		try
		{
			if(myFile.createNewFile())
			{
				System.out.println("File created successfully..!");
			}
			else
			{
				System.out.println("File already Exist..!");
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong!!!");
		}
	}
}