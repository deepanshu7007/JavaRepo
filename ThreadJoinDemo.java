class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			try
			{
			Thread.sleep(2000);
			System.out.println("Seeta Thread");
			}
			catch(InterruptedException e)
			{
				
			}
		}
	}
}
class ThreadJoinDemo 
{
	public static void main(String args[])
	{
		MyThread mt = new MyThread();
		mt.start();
		try
		{
		mt.join();
		for(int i=0;i<5;i++)
			{
				System.out.println("Rama Thread");
			}
		}
		catch(InterruptedException e)
		{
		
		}
	}
}
