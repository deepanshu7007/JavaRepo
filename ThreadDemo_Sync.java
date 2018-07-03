class Message
{
	void print(String st)
	{
		
		
			System.out.print("[ "+st);
			System.out.print("]");
			System.out.println();
	}
}
class NewThread extends Thread
{
	Message msg;
	String st;
	NewThread(Message msg,String st)
	{
		this.st = st;
		this.msg = msg;
		start();
	}
	public void run()
	{
		synchronized (msg)
		{
			msg.print(st);
		}
		System.out.println("hello");
	}
}
class ThreadDemo_Sync
{
	public static void main(String args[])
	{
		Message msg = new Message();
		NewThread n1 = new NewThread(msg,"Thread 1");
		NewThread n2 = new NewThread(msg,"Thread 2");
		NewThread n3 = new NewThread(msg,"Thread 3");
	}
}