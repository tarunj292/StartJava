/*Wap to accept a file name from the user and open it for reading. If the file does not exist, handle FileNotFoundException. If the file exists, then print its contents on the output screen.*/
import java.util.Scanner;
import java.io.*;
class FileReadingEx
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the file:");
		String file = sc.nextLine();
		try
		{
			BufferedReader bf = new BufferedReader(new FileReader(file));
			String line;
			while((line = bf.readLine()) != null)
			{
				System.out.print(line);
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		catch(IOException e)
		{
			System.err.println(e);
		}
	} 
}