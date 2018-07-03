import java.net.*;
import java.io.*;
import java.util.Scanner;
class SimpleClient1
{
	public static void main(String[] args)
	{
		try
		{
			int x,y;
			Scanner s = new Scanner(System.in);
			System.out.println("Enter Two Numbers:");
			x=s.nextInt();
			y=s.nextInt();
			String ip = System.getProperty("Server");
			Socket client = new Socket(ip,5432);
			OutputStream outToServer = client.getOutputStream();
			DataOutputStream out = new DataOutputStream(outToServer);
			out.writeUTF(x+"~"+y);
			InputStream inFromServer = client.getInputStream();
			DataInputStream in = new DataInputStream(inFromServer);
			System.out.println("Server Says:"+in.readUTF());
			client.close();
		}
		catch(ConnectException e)
		{
			System.err.println("Could not connect to Server");
		}
		catch(IOException err){}
	}
}