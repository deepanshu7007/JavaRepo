class Base
{
synchronized public void show(String msg) throws InterruptedException
{
	for(int i=0;i<10;i++)
	{
		System.out.print("Good Morning");
		Thread.sleep(2000);
		System.out.println(msg);
	}
}

}
class MyClass extends Thread
{
	Base b;
	String name;
	MyClass(String str,Base b)
	{
		this.b = b;	
		this.name = str;
	}
	public void run()
	{
		try
		{
		b.show(name);
	}catch(InterruptedException e){}
	}
} 
class Child
{
	public static void main(String[] args)
	{
		Base b = new Base();
		MyClass my1 = new MyClass("Dhoni",b);
		MyClass my2 = new MyClass("Rahul",b);
		my1.start();
		my2.start();
	}
}