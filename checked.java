import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Write a description of class unchecked here.
 * 
 * @nAfi sMart
 * @5/11/15
 */
public class checked
{
    
    public static void main(String args[])
    {
        System.out.println("if you want see all files lines enter 1");
        Scanner in=new Scanner(System.in);
        int i=in.nextInt();
        while(i>0)
        {
        try{
            
            System.out.println("enter file name");
            Scanner obj=new Scanner(System.in);
            String name=obj.nextLine();
        Scanner file=new Scanner(new File(name));
        String line=file.nextLine();
        System.out.println(line);
        
    }
    catch(FileNotFoundException e)
    {
       e.getMessage();
        System.out.println("not present");
    }
    finally
    {   
        
}
}
}
}
