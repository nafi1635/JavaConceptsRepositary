package lab5;


/**
 * Write a description of class circle here.
 * 
 * @smart nafi
 * @8/10/15
 */


public class triangle
{
	private double base;
	private double height;
	double area;
	
public triangle(double b,double h)
	{
		base=b;
		height=h;
		area=0.5*b*h;
		
	}
	
public double getarea()
{
    
    return area;
}
void display()
{
    System.out.println("This is traingle area"+"   "+area);

}
}



    

	