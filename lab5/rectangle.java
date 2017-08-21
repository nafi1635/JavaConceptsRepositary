package lab5;


/**
 * Write a description of class circle here.
 * 
 * @smart nafi
 * @8/10/15
 */


public class rectangle
{
	private double length;
	private double breadth;
	double area;
	
public rectangle(double l,double b)
	{
		length=l;
		breadth=b;
		area=length*breadth;
	}

public double getarea()
{
    return area;
}
void display()
{
    System.out.println("This is the area of rectangle"+"   "+area);

}
}



    

	
