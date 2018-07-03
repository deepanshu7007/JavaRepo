import java.util.Scanner;
class RepetationArray
{
	public static void main(String args[])
	{
		System.out.println("Enter the values to the array:");
		Scanner s = new Scanner(System.in);
		int arr[] = new int[5];
		int temp[] = new int[5];
		int i=0,k=0,rep=0,j=0;
		while(i<5)
		{
			arr[i]=s.nextInt();
			i++;
		}
		temp[0]=0;
		i=0;
		while(i<5)
		{
		rep=0;
		j=i;
		while(j<5)
		{
			if(arr[i]==arr[j])
			{
				rep++;
			}
			j++;
		}
		temp[i]=arr[i];
		k=0;
			while(k<=i)
			{
				if(temp[k]==arr[i])
				{
					i++;
				}
			    k++;
		    }
		System.out.println("Element:"+arr[i]+"Repeatation"+rep);
		i++;
		}
	}
}