import java.util.Scanner;

class GeneratingTables
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int val;
		int len;
		int i;
		char ch;
		do
		{
		System.out.println("Enter the integer value to Generate the tables:");
		val=s.nextInt();
		System.out.println("Enter the Length of the table to be displayed:");
		len=s.nextInt();
		System.out.println("================================================");
		i=0;
		while(i<len)
		{
			System.out.println(val+" "+"*"+" "+i+" "+"="+(val*i));
			i++;
		}
		System.out.println("================================================");
		System.out.println("Do you want to Continue(Y/N):");
		ch=s.next().charAt(0);
		ch=ch.toUpper();
		}while(ch!='n');
	}
}