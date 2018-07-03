class myThread extends Thread
{
	public void run()
	{
		System.out.println(this);
	}
}
class TestInfo
{
	public static void main(String args[])
	{
		myThread t = new myThread();
		t.run();
		System.out.println(t);
	}
}