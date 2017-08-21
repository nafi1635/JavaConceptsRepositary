package newconcept;


/**
 * Write a description of class readenter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class readenter
{
   public static void main(String args[]) throws IOException
   {
       InputStreamReader cin=null;
       try
            {
                cin=new InputStreamReader(System.in);
                System.out.println("enter charcters ,q to quit");
                char c;
                do
                    {
                        c=(char) cin.read();
                        System.out.print(c);
                    }while(c!='q');
             }
       finally
            {
                if(cin!=null)
                {
                    cin.close();
                }
            }
        }  
 }      