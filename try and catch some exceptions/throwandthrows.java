import java.io.*;  

class M{  
 void method()throws IOException{  
  throw new IOException("device error");  
 }  
}  
  
  
class  throwandthrows
	{  
  	 public static void main(String args[])
  	 	{  
  			  try
  			  		{  
     					throwandthrows t=new throwandthrows();  
   					  t.method();  
    						}
    			catch(Exception e)
    			{
    			System.out.println("exception handled");
    			}     
  
    System.out.println("normal flow...");  
  }  
}  
