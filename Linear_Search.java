//program for linear Search
import java.util.Scanner;
class Linear_Search
{
	public static void main(String[] args)
	{
		System.out.println("Enter the Values to the array:");
		Scanner s = new Scanner(System.in);
		int arr[] = new int[5];
		boolean flag = false;
		int i=0;
		for(i=0;i<5;i++)
		{
			arr[i]=s.nextInt();
		}
		int Val=0,Pos=0;
		System.out.println("Enter the value You want to Search:");
		Val = s.nextInt();
		i=0;
		while(i<5)
		{
			if(arr[i]==Val)
			{
				flag = true;
				Pos = i;
				break;
			}
		i++;
		}
		if(flag==true)
		{
			Pos++;
			System.out.println("The Element is present at:"+Pos+"Location.");
		}
		else
			System.out.println("The Element you entered is not present in the Array");
	}
}