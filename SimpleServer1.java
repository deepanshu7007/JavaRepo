import java.net.*;
import java.io.*;
class SimpleServer1
{
	public static void main(String[] args)
	{
	ServerSocket ServerSocket=null;
	try
	{
		ServerSocket = new ServerSocket(5432);
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	while(true)
	{
		try
		{
			Socket server = ServerSocket.accept();
			System.out.println("Connection accepted : Port ="+server.getPort());
			DataInputStream in = new DataInputStream(server.getInputStream());
			String st = in.readUTF().toString();
			System.out.println("String:"+st);
			String s[]=st.split("~");
			int n1 = Integer.parseInt(s[0]); 
			int n2 = Integer.parseInt(s[1]);
			int sum = n1 + n2;
			String ss = String.valueOf(sum);
			DataOutputStream out = new DataOutputStream(server.getOutputStream());
			out.writeUTF("Sum is:"+ss);
			server.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
}