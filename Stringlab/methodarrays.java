package Stringlab;

import java.util.*; 
public class methodarrays
{
    private double[] marks;
    private int currentSize; // The currentSize of the array of marks.

    public methodarrays(int maxSize)
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
    	public void sorting()
	{
		double a[]=new double[marks.length];
    		for(int i=0;i<a.length;i++)
    		{
    			a[i]=marks[i];
    		}
		Arrays.sort(a);
		for(int i=0;i<currentSize;i++)
     	   {
     	   	System.out.print(a[i]+"\t");
     	   }
	}
	public int find(double searchedValue)
    {      
    		int x=Arrays.binarySearch(marks,searchedValue);
    		return x;
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
        int p=Arrays.indexOf(c);
        return p;
    }
	
}
	
