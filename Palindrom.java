import java.util.Scanner;
class Palindrom
	{
		public static void main(String args[])
		{
			int Num = 0,Temp = 0,Rem = 0,Div = 0;
			Scanner s = new Scanner(System.in);
			System.out.print("Enter the integer value:");
			Num = s.nextInt();
			Temp = Num;
			while(Temp!=0)
			{
				Rem = Temp % 10;
				Div = Div * 10 + Rem;
				Temp = Temp / 10;
			}
			if(Num == Div)
			{
				System.out.println("The Entered Element is a Palindrom");
			}
			else
				System.out.println("The Entered Element is not a Palindrom");
		}
	}
