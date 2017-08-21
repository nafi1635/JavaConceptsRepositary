package asmnt;

public class emp{
	private String firstname;
	private String lastname;
	private int salary;
	private int empid;

	public emp( String f,String l,int s,int id)
{
	firstname=f;
	lastname=l;
	salary=s;
	empid=id;	
}
	public String empname()
{
	return firstname+lastname;
}
	public int empsalary()
{
	return salary;
}
	public int empid()
{
	return empid;
}
}
