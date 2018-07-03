import java.util.Scanner;
class Array 
{
	public static void main(String args[])
	{
		int i;
		int arr[] = new int[5];
		System.out.print("Enter the Integer value :");
		Scanner s = new Scanner(System.in);
		for(i=0;i<5;i++)
		{
			arr[i] = s.nextInt();
		}
		System.out.println("The entered element is as under\n");
		for(i=0;i<5;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}
}