package lab5;


/**
 * Write a description of class square here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class square
{
    private double side;
    double area;
    
      public square(double s)
        {
            side=s;
            area=s*s;
        }
        
        public double getarea()
 {
     return area;
 }
 void display()
 {
     System.out.println("This is the area of square of your values"+"  "+area);
    }
}
 