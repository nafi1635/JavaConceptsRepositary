/**
nAfi
date:22/12/15
*/
  
import java.io.*;  
import java.net.*;  
  
public class urlclass
{  
	public static void main(String[] args)
	{  
		try
		{  
			URL url=new URL("http://en.softonic.com/android");  
  
			System.out.println("Protocol: "+url.getProtocol());  
			System.out.println("Host Name: "+url.getHost());  
			System.out.println("Port Number: "+url.getPort());  
			System.out.println("File Name: "+url.getFile());  
  
		}
		catch(Exception e)
		{
		System.out.println(e);
		}  
	}  
}  
