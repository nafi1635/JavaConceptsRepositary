package project1;


/**
 * Write a description of 3class machine here.
 * 
 * @smart nafi
 * @5/11/15
 */
import java.util.Scanner;
public class machine
{
    
  


public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // asking username
    System.out.print("Username: ");
    String username = input.nextLine();

    String inpText;
    do {
        System.out.print(username + "$: ");
        inpText = input.nextLine();
        System.out.print("\n");
        // analyzing
        switch (inpText) {
        case "bhagavan":
            System.out.println("yes he is a bugga");
            break;
        case "vignan":
            System.out.println(">yes he is a bugga");
            break;
        case "nilesh":
            System.out.println(">yes he is a bugga");
            break;    
        case "margam":
            System.out.println(">yes he is a bugga");
            break;   
        case "nafi":
            System.out.println("he is absolutely intelgnt not bugga");
            break;     
        default:
            System.out.println("> Command not recognized");
        }
    } while (inpText != "ha");

    System.out.println("Bye!..");
}
}