import java.io.*;
public class InputOutput
{
	public static void main(String[] args) throws InterruptedException
	{
		try
		{
			InputStreamReader ir = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(ir);
			System.out.println("Enter the String:");
			String st = br.readLine();
			OutputStreamWriter ow = new OutputStreamWriter(System.out);
			BufferedWritter bw = new BufferedWritter(ow);
			bw.write(st);
			ir.close();
			br.close();
			bw.close();
			ow.close();
		}
		
	catch(IOException e)
	{
		System.out.println(e);
	}
}
	
}