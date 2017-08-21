package project1;


/**
 * Write a description of class comparison here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.io.*;
public class comparison
{
   
/**
 * Write a description of class comparisonprogram here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
   public static void main(String args[])
    {
        int i=0,j=0;
        FileInputStream f1=null;
        FileInputStream f2=null;
        try
            {
                f1=new FileInputStream(file.txt);
                f2=new FileInputStream(file2.txt);
                    do
                        {
                            i=f1.read();
                            j=f2.read();
                            if(i!=j)
                            break;
                        }while(i!=-1&&j!=-1); 
                        if(i==-1&&j==-1)
                            System.out.println("YAAAAAAAAAA files are same");
                        else
                        System.out.println("Not same...");
              }
        catch(Ioexception e)
            {
                System.out.println(e.getMessage());
            }
        finally
              {
                  try
                    {
                        if(f1!=null)
                            f1.close();
                         if(f2!=null)
                            f2.close();
                        }
                  catch(IoException e)
                            {
                                System.out.println(e.getMessage());
                            }   
                 }
    } 
}