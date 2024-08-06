import java.io.*;
class CountFileChar
{
	public static void main(String [] args)
	{
		try
		{
			FileReader fr = new FileReader("C:\\Tarun_java\\FileHandling\\firstFile.txt");
			int c = 0;
			while(fr.read()!=-1)
				c++;
			System.out.println(c + " are number of character's in File");
			fr.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}