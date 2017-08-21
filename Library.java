import java.util.Scanner;
public class Library
{
String books[];
public Library(){
books = new String[10];
}
public static void main(String args[]){
Scanner in = new Scanner(System.in);
Library lib = new Library();
lib.addBooks();
System.out.println("***Welcome to digital library of RGUKT***");
System.out.println("Enter a serach term: ");
String term = in.nextLine();
System.out.println("Following books found:");
lib.searchBooks(term);
}
void searchBooks(String term){
//Search the list of books and print the matching book names
//Print "No book found" if search does not match any book name
}
void addBooks(){
books[0] = "Java A Beginners Guide";
books[1] = "Introduction to Database Management Systems";
books[2] = "Digital Logic Design";
books[3] = "Java The complete reference";
books[4] = "The art of elctronics";
books[5] = "Core java for beginners";
books[6] = "Fundamentals of Digital Logic";
books[7] = "Digital Logic and Design";
books[8] = "Starting electronics";
books[9] = "Database Management Systems";
}
}