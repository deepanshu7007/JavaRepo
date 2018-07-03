import java.net.*;
import java.io.*;
public class SimpleServer
{
	public static void main(String[] args) throws IOException
	{
				
			ServerSocket s = new ServerSocket(5432);
		
		
		
	while(true)
	{
		try
		{
			Socket s1 = s.accept();
			System.out.println("Connection Accepted Successfully on port="+s1.getPort());
			OutputStream s1out = s1.getOutputStream();
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s1out));
			new OutputStreamWriter(s1out);
			bw.close();
			s1.close();
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	}
	
}