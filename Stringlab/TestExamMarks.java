package Stringlab;

import java.util.Scanner;
public class TestExamMarks
{
    public static void main(String[] args)
    {
       ExamMarks mt = new ExamMarks(5);
       Scanner in1 = new Scanner(System.in);
       System.out.println("Enter marks, Q to quit: ");
       mt.readMarks(in1);
       System.out.println("Entered marks are: ");
       mt.printMarks();
	  System.out.println("\nMarks in sorted order: ");
	  mt.sort();
	  System.out.println();
	  mt.printMarks();
	  System.out.println("\nEnter search value: ");
	  double sv = in1.nextDouble();
       System.out.println("The value found in position: " + mt.find(sv));
       System.out.println("Index of lowest mark: " + mt.getLowMarkIndex());
       System.out.println("lowest marks are : "+mt.lowMark());
       mt.removeLowest();
       System.out.println("After dropping the lowest mark: ");
       mt.printMarks();
	  System.out.println("\nMarks in sorted order: ");
	  mt.sort();
	  System.out.println("\nenter the position of element u want to delete");
	  int x=in1.nextInt();
	  mt.remove(x);
	  System.out.println("\nAfter deletion array is");
	  mt.printMarks();
	  System.out.println();
	
	
		
    }
}
