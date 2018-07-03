import java.util.Scanner;
class RepArray
{
	public static void main(String args[])
	{
		System.out.println("Enter the values to the array:");
		Scanner s = new Scanner(System.in);
		int arr[] = new int[5];
		int i=0,j=0,rep=0;
		while(i<5)
		{
			arr[i]=s.nextInt();
			i++;
		}
		i=0;
		while(i<5)
		{
			rep=0;
			j=0;
			while(j<5)
			{
				if(arr[i]==arr[j])
				{
					rep++;
				}
			j++;
			}
			System.out.println("Element:"+arr[i]+"\t"+"Repetation:"+rep);
		i++;
		}
	}
}