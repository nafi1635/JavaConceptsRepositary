package f2;
public class student	
{
	public String firstname;
	public String lastname;
	public int  id;
	public int  year;
	public int  age;
	public String department;
	
public student(String f,String l,int i,int y,int a,String d)
	{
		firstname=f;
		lastname=l;
		id=i;
		year=y;
		age=a;
		department=d;
		
	}
public String getname()
{
	return firstname+lastname;
}
	public int getid()
{
	return id;
}
public int getyear()
{
	return year;
}
	public int getage()
{
	return age;
}
	public String getdept()
{
	return department;
}

public int promote(int x)
{
	return year+x;
}
}
