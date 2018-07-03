import java.util.Scanner;
class Switch
{
	public static void main(String args[])
	{
		String Name;
		char ch;
		Scanner s = new Scanner(System.in);
		System.out.println("||This is a program of Knowing about the planet||");
		System.out.println("=================================================");
		do
		{
		System.out.print("Enter the name of planet:");
		Name=s.next();
		switch(Name)
		{
			case "Mercury":
			{
				System.out.println("Mercury is the First Planet");
				break;
			}
			case "Venus":
			{
				System.out.println("Venus is the Hell Planet");
				break;
			}
			case "Earth":
			{
				System.out.println("Earth is the only planet where the Life Exists");
				break;
			}
			case "Mars":
			{
				System.out.println("Mars is the planet with maximum similarities");
				break; 
			}
			case "Jupiter":
			{
				System.out.println("Jupiter is the biggest planet");
				break;
			}
			case "Saturn":
			{
				System.out.println("Saturn has the most of Moons");
				break;
			}
			case "Uranus":
			{
				System.out.println("Uranus is the beautiful planet");
				break;
			}
			case "Neptune":
			{
				System.out.println("Neptune has the rainfall of Diamonds");
				break;
			}
			case "Pluto":
			{
				System.out.println("Pluto is the last planet in Solar System");
				break;
			}
			default :
			{
				System.out.println("You have Entered an invalid planet");
				break;
			}
		}
		System.out.println("Do you want to Continue(Y/N):");
		ch=s.next().charAt(0);
		}while(ch!='Y' || ch!='y');
	}
}