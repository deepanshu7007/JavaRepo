import java.util.Scanner;
class Student
{
	String name,address,school;
	int std,rollno;
	float marks;
	void Input()
	{
		System.out.print("Enter the name       :");
		Scanner s = new Scanner(System.in);
		name=s.nextLine();
		System.out.print("Enter the address    :");
		address=s.nextLine();
		System.out.print("Enter the school     :");
		school=s.nextLine();
		System.out.print("Enter the class      :");
		std=s.nextInt();
		System.out.print("Enter the roll number:");
		rollno=s.nextInt();
		System.out.print("Enter the marks      :");
		marks=s.nextFloat();
	}
	void Display()
	{
		System.out.println("==============================");
		System.out.println("Name   :"+name);
		System.out.println("Address:"+address);
		System.out.println("Class  :"+std);
		System.out.println("Marks  :"+marks);
		System.out.println("School :"+school);
	}
}
class StudentInfo
{
	public static void main(String[] args)
	{
		Student s = new Student();
		s.Input();
		s.Display();	
	}
}