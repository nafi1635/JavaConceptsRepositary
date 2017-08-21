
/**
 * Write a description of class exceptionhandling here.
 * 
 *smart nAFi
 *8/10/15..
 */
import java.util.Scanner;
public class exceptionhandling
{
    



  public static void main(String[] args) {
 
  int a, b, result;
 
  Scanner input = new Scanner(System.in);
  System.out.println("Input two integers");
 
  a = input.nextInt();
  b = input.nextInt();
 
  result = a / b;
 
  System.out.println("Result = " + result);
  }
}