/**
nAfi
7-02-16
*/
import java.util.*;
public class addstudents
{
        public static void main(String args[])
        {
                System.out.println("How many student details you want to enter");
                int n;
                  int k=1; 
                 Scanner obj=new Scanner(System.in);
                 n=obj.nextInt();
                    for(int i=1;i<=n;i++)
                    {
                    System.out.println("Enter "+i+"student details");
                    System.out.println("Enter student name");
                   // Scanner obj=new Scanner(System.in);
                    String name=obj.next();
                    System.out.println("Enter student age");
                        int age=obj.nextInt();  
                      
                    student k"+i=new student(i,name,age);
                   
                   } 
                  // k=k+1;
           //     student s2=new student(2,"nazeem",18);
                ArrayList al=new ArrayList();
                    for(int j=1;j<=n;j++)
                    {
                        al.add(j);
                     }   
               // al.add(s2);
                Iterator it=al.iterator();
                while(it.hasNext())
                {
                    student st=(student)it.next();   //casting
                    System.out.println(st.rollno+" "+st.name+" "+st.age);  
                }
                
                
        }
}        

