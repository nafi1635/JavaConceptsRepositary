package asmnt;

import java.util.Scanner;

public class studentt{
public static void main(String args[]){
String f,l,id,dept;
double year,age;
System.out.println("Enter how many student details you want to store: ");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=1;i<n;i++)
{
studentt student=new studentt();

System.out.println("Enter your 1st name:");
f=s.next();
System.out.println("enter your last name:");
l=s.next();
System.out.println("Enter your id:");
id=s.next();
System.out.println("enter your department :");
dept=s.next();
System.out.println("Enter your year :");
year=s.nextDouble();
System.out.println("Enter your age:");
age=s.nextDouble();
}
}
}
