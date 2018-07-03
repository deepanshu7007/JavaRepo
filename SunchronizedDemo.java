class Display
{
	public synchronized void ShowMessage(String name)
	{
		for(int i=0;i<10;i++)
		{
			System.out.print("Good Morning:");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				//error Area
			}
		System.out.println(name);
		}
	}
}
class Play
{
	public synchronized void ShowMessage(String name)
	{
		for(int i=0;i<10;i++)
		{
			System.out.print("Good Morning:");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				//error Area
			}
		System.out.println(name);
		}
	}
}
class MyThread extends Thread
{
	Display d;
	String name;
	MyThread(Display d,String name)
	{
		this.d = d;
		this.name = name;
	}
	public void run()
	{
		ShowMessage(name);
	}
}
class SunchronizedDemo
{
	public static void main(String[] args)
	{
		Display d = new Display();
		MyThread mt = new MyThread(d,"Deepanshu");
		MyThread mt2 = new MyThread(d,"Choudhary");
	}
}