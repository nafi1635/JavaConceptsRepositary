package Stringlab;

import java.util.Scanner;

/**
 * Holds the exam marks for students.
 */
public class ExamMarks
{
    private double[] marks;
    private int currentSize; // The currentSize of the array of marks.

    public ExamMarks(int maxSize)
    {
        marks = new double[maxSize];
        currentSize = 0;
    }

	public void readMarks(Scanner x)
    {
    		
        for(int i=0;i<marks.length;i++)
        {
            double nextMark = x.nextDouble();
            marks[currentSize] = nextMark;
            currentSize++;
            if(currentSize == marks.length)
                break;
        }
    }
	
	public void printMarks()
    {
        for(int i=0;i<currentSize;i++)
        {
        	System.out.print(marks[i]+"\t");
        }
    }
	
	public void sort()
	{
		double a[]=new double[marks.length];
    		for(int i=0;i<a.length;i++)
    		{
    			a[i]=marks[i];
    		}
		for(int i=1;i<currentSize;i++)
		{
			for(int j=i;j>0;j--)
			{
				if(a[j-1]>a[j])
				{
					double c=a[j-1];
					a[j-1]=a[j];
					a[j]=c;
				}
			}
		}
		for(int i=0;i<currentSize;i++)
     	   {
     	   	System.out.print(a[i]+"\t");
     	   }
		
	}

	
    public int find(double searchedValue)
    {      
    		int c=0;
    		int d=0;
    		for(int i=0;i<currentSize;i++)
    		{
    			if(marks[i]==searchedValue)
    			{
    				c++;
    				d=i;
    				break;
    				
    			}
    		}
    		if(c==0)
    		{
    			return (-1);
    		}
    		else
    			return d;
    }
	
	public int getLowMarkIndex()
    {
        double c=0;
        c=marks[0];
        for(int i=1;i<currentSize;i++)
        {
        	if(marks[i]<c)
        	c=marks[i];
        }
        int p=this.find(c);
        return p;
    }

    public double lowMark()
    {
    	   double c=0;
        c=marks[0];
        for(int i=1;i<currentSize;i++)
        {
        	if(marks[i]<c)
        	c=marks[i];
        }
        return c;
        
    }

	public void removeLowest()
    {
        
	 double x=this.lowMark();
	 int index=this.getLowMarkIndex();
	 for(int i=index;i<marks.length-1;i++)
	 {
	 	marks[i]=marks[i+1];
	 }
	 currentSize--;
	 
    }

    public void remove(int pos)
    {

        for(int i=pos;i<currentSize;i++)
	 {
	 	marks[i]=marks[i+1];
	 } 
	 currentSize--;
	 this.printMarks();
	 
    }
}


