class PassingValue
{
	public static void main(String args[])
	{
		int Num1,Num2,Sum=0;
		System.out.println("Enter the Integer value:");
		Num1=Integer.parseInt(args[0]);
		Num2=Integer.parseInt(args[1]);
		Sum=Num1+Num2;
		System.out.println("The Sum of both the elements are:"+Sum);
	}
}