import java.util.Scanner;
class SumOfDigits
{
	public static void main(String args[])
	{
		int Num,Val=0,Rem,Temp;
		System.out.print("Enter the Integer value:");
		Scanner s = new Scanner(System.in);
		Num = s.nextInt();
		Temp = Num;
		while(Num != 0)
		{
			Rem = Num % 10;
			Val = Val + Rem;
			Num = Num / 10;
		}
		System.out.println("The Sum of digits of " + Temp +"is:"+Val);
	}
}