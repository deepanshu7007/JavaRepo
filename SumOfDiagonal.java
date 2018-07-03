import java.util.Scanner;
class SumOfDiagonal
{
	public static void main(String args[])
	{
		System.out.println("Enter the Values to the array");
		int arr[][] = new int [3][3];
		Scanner s = new Scanner(System.in);
		int d1=0,d2=0;
		int i=0,j=0;
		while(i < 3)
		{
			j=0;
			while(j<3)												//1 2 3
			{														//4 5 6 
				arr[i][j]=s.nextInt();								//7	8 9
				j++;
			}
			i++;
		}
		i=0;
		while(i<3)
		{
			j=0;
			while(j<3)
			{
				if(i == j)
				{
					d1=d1+arr[i][j];
				}
				if((i+j) == 2 )
				{
					d2=d2+arr[i][j];
				}
			j++;
			}
		i++;
		}
		System.out.println("The Sum of Diagonal 1 is :"+d1);
		System.out.println("The Sum of Diagonal 2 is :"+d2);
	
	}
}