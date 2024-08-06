public class MyThread implements Runnable
{
	public void run()
	{
		for(int i=0; i<1000; i++)
		{
			System.out.println("Hey Thread 1 started....");
		}
	}
	public static void main(String [] main)
	{
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		t.start();
	}
}