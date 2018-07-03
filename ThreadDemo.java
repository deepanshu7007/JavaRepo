class NewThread implements Runnable
{
	Thread t;
	NewThread()
	{
		t=new Thread(this,"Child Thread");
		t.start();
	}
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Child"+i);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}
class ThreadDemo
{
	public static void main(String args[])
	{
		try
		{
			NewThread n = new NewThread();
			for(int i=1;i<=5;i++)
			{
				System.out.println("main:"+i);
				Thread.sleep(2000);
			}				
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}