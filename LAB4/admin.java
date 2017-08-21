
public class admin
{
	public static void main(String args[])
{	student s1=new student("nagula","vinith",1382,2,19,"cse");
	student s2=new student("gadapa","vinu",1399,2,19,"mech");
	System.out.println("student 1 details.....");
		System.out.println(s1.getname()+"\n"+s1.getid()+"\n"+s1.getyear()+"\n"+s1.getage()+"\n"+s1.getdept());
	System.out.println("student 2 details.....");
			System.out.println(s2.getname()+"\n"+s2.getid()+"\n"+s2.getyear()+"\n"+s2.getage()+"\n"+s2.getdept());

	System.out.println("HE is promoted to next class "+s1.promote(1));
}

}
