package newconcept;


/**
 * Write a description of class copyfile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;

public class copyfile
{
    public static void main(String args[])

    {
        int i;
        FileInputStream fin=null;
        FileOutputStream fout=null;
        if(args.length!=-2)
            {
                System.out.println("copy file from to");
                return;
            }
        try
        {
            fin=new FileInputStream(args[0]);
            fout=new FileOutputStream(args[1]);
            do{
                i=fin.read();
                if(i!=-1)
                fout.write(i);
            }while(i!=-1);
        }
        catch(IOException e)
        {
            System.out.println("error close");
        }
        finally
        {
            try
                {
                    if(fin!=null)
                    fin.close();
                }
            catch(IOException ex)
            {
                System.out.println("error closing");
            }
            try
                {
                    if(fout!=null)
                    fout.close();
                }
            catch(IOException exc)
            {
                System.out.println("error closing");
            }
        }    
    }
}
                
            