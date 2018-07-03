import java.util.Scanner;
class Base
{
	int a,b;
	void Swap(int a,int b)
	{
		int c;
			c=a;
			a=b;
			b=c;
			this.a=a;
			this.b=b;
	}
}
class Swapping
{
	public static void main(String args[])
	{
		Base b = new Base();
		System.out.println("The values Before Swap is:");
		System.out.print("A:"+10);
		System.out.print("\t B:"+20);
		b.Swap(10,20);
		System.out.println("The Values After Swap is:");
		System.out.println("A:"+b.a);
		System.out.println("B:"+b.b);
	}
}