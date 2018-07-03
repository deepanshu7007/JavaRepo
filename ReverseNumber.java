import java.util.Scanner;
class ReverseNumber
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int rem,num,rev=0;
		System.out.println("Enter Number:");
		num=s.nextInt();
		do
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}while(num!=0);
		System.out.println("Reverse is:"+rev);

	}
}