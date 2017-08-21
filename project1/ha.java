package project1;


/**
 * Write a description of class ha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class ha
{
    

private static int typing;



public static void main(String argv[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Testing starts");
    while(sc.hasNextInt()){
        typing = sc.nextInt();
        switch(typing){
            case 0:
              break; //Here I want to break the while loop
            case 1:
              System.out.println("You choosed 1");
              break;
            case 2:
              System.out.println("You choosed 2");
              break;
            default:
              System.out.println("No such choice");
        }
    }
      System.out.println("Test is done");
    }
}
