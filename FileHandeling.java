import java.io.*;
class FileHandeling
{
	public static void main(String[] args)
	{
		try
		{
			FileReader fr = new FileReader("//home//deepanshu//Desktop//MyFile");
			InputStreamReader ir = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(ir);
			System.out.print("Enter User-Name:");
			String usr = br.readLine();
			System.out.print("Enter Password:");
			String pas = br.readLine();
			String st;
			int c=0;
			while((st=br.readLine())!=null)
			{
				String ar[] = st.split("~");
				if(usr.equals(ar[0])&&pas.equals(ar[1]))
				{
					System.out.println("Valid User:");
					c=1;
					break;
				}
			}
			if(c==0)
			{
				System.out.println("Invalid User");
			}
			if(c==1)
			{
				System.out.println("Valid User");
			}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}