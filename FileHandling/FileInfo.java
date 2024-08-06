import java.io.*;
class FileInfo
{
	public static void main(String [] args)
	{
		File f = new File("C:\\Tarun_java\\FileHandling\\FirstFile.txt");
		if(f.exists())
		{
			System.out.println("File Name: " + f.getName());
			System.out.println("File Location: " + f.getAbsolutePath());
			System.out.println("File Writeable: " + f.canWrite());
			System.out.println("File Readable: " + f.canRead());
			System.out.println("File Size: " + f.length());
			System.out.println("File Removed " + f.delete());
		}
		else
		{
			System.out.println("File doesn't Exists");
		}
	}
}