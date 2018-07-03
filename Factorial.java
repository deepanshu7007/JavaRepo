import java.util.Scanner;

	class Factorial
	{
		public static void main(String args[])
		{
			int Num,Val=1,Temp;
			System.out.print("Enter the Integer value:");
			Scanner s = new Scanner(System.in);
			Num = s.nextInt();
				Temp=Num;
				while(Temp>0)
					{
						Val = Val * Temp;
						Temp--;
					}
			System.out.println("The Factorial of the given number is:"+Val);
		}
	}
