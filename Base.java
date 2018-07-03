class Derived
{
	String name;
	Derived()
	{
		name = "Eat Sleep Code Repeat";
	}
	void display()
	{
		System.out.println(this.name);
	}
}
class Base
{
	public static void main(String args[])
	{
		Derived d = new Derived();
		d.display();
	}
}