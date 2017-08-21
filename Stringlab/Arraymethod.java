package Stringlab;

import java.util.*;
public class Arraymethod
{
	public static void main(String args[])
	{
	  methodarrays mt = new methodarrays(5);
       Scanner in1 = new Scanner(System.in);
       System.out.println("Enter marks, Q to quit: ");
       mt.readMarks(in1);
       System.out.println("\nEntered marks are: ");
       mt.printMarks();
       System.out.println();
       mt.sorting();
       System.out.println("\nEnter search value: ");
	  double sv = in1.nextDouble();
       System.out.println("\nThe value found in position: " + mt.find(sv));
       System.out.println("Index of lowest mark: " + mt.getLowMarkIndex());
     }
     
}
