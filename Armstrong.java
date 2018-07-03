import java.util.Scanner;
class Armstrong
{
	public static void main(String args[])
	{
		int Num,Temp,Rem,Arm=0;
		Scanner s = new Scanner(System.in);  
		System.out.print("Enter the integer value:");
		Num = s.nextInt();
		Temp=Num;
		while(Temp!=0)
		{
			Rem = Temp % 10;
			Arm = Arm+Rem*Rem*Rem;
			Temp = Temp / 10;
		}
		if(Arm == Num)
			System.out.println("The Enter Number is an Armstrong");
		else
			System.out.println("The Entered Number is not an Armstrong");
	}
}