package lab5;


/**
 * Write a description of class times here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class times
{
    private int hour;
    private int minute;
    private int seconds;
    
    
    public times(int hour,int minute,int seconds)
    {
         this.hour=hour;
         this.minute=minute;
        this.seconds=seconds;
        
       
    }
    
  void displaysec()
  {
      seconds=seconds+1;
             if(seconds==60)
                {
                    seconds++;
                    minute++;
                    System.out.println(seconds);
        
                }
       
       
     
}
}