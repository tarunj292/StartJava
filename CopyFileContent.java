import java.io.*;
class CopyFileContent
{
	public static void main(String [] args) throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Tarun_java\\FileHandling\\firstFile.txt");
		FileOutputStream fos = new FileOutputStream("C:\\Tarun_java\\copy.txt");
		int c;
		while((c=fis.read()) != -1)
		{
			fos.write(c);
		}
		fis.close();
		fos.close();
	}
}