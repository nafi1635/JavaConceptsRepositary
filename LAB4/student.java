public class student	
{
	private String firstname;
	private String lastname;
	private int  id;
	private int  year;
	private int  age;
      
                                                             m
	private Picture carPic2;
public student(String f,String l,int i,int y,int a,String d)
	{
		firstname=f;
		lastname=l;
		id=i;
		year=y;
		age=a;
		department=d;
		carPic = new Picture("bike.jpg");
		//carPic2=new Picture("car.jpg");
		carPic.draw();
		
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
