import java.util.Scanner;
public class Student{
public static void main(String args[]){
StudentDirectory stu=new StudentDirectory();
System.out.println("enter how many no of students details do you want store");
Scanner st=new Scanner(System.in);
int n=st.nextInt();
for(int i=0;i<n;i++)
{

Scanner sta=new Scanner(System.in);
System.out.println("enter the student first name");
stu.Firstname=sta.next();
System.out.println("enter the student last name");
stu.Lastname=sta.next();
System.out.println("enter the student id");
stu.Id=sta.next();
System.out.println("enter the student year");
stu.Year=sta.next();
System.out.println("enter the student dept");
stu.Dept=sta.next();
System.out.println("enter the student age");
stu.Age=sta.nextInt();
System.out.println("enter whether student was promoted or not \nex: if promoted enter true else false");
stu.Promote=sta.nextBoolean();
}
System.out.println("********Student details********");
System.out.println("StudentName : "+stu.Firstname+stu.Lastname);
System.out.println("IDNumber    : "+stu.Id);
System.out.println("AcadamicYear: "+stu.Year);
System.out.println("Deaprtment  : "+stu.Dept);
System.out.println("Age         : "+stu.Age);
if(stu.Promote==true)
System.out.println("Status      : "+"Promoted");
else
System.out.println("Not Promoted");
System.out.println("dou you want change department? if yes press 1 else 0");
int m=st.nextInt();
if(m==1)
{
System.out.println("enter the dapartment");
stu.Dept=st.next();

}
}
}

