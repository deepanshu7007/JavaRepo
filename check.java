class myClass extends Thread
{

	public void run()
	{
		try{
		Thread.sleep(2000);
		System.out.println("Hello World");
	}catch(InterruptedException e)
	{}
	}
}
class check
{
	public static void main(String args[])
	{
		myClass my = new myClass();
		my.start();
	}
}