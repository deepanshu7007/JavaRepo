class MainThread extends Thread
{
	public static void main(String args[])
	{
		MainThread m1;
		m1.start();
		System.out.println();
		void run()
		{
			System.out.println("In the main");
			m1.sleep(2000);
		}
		System.out.println("After Main");
	}
}