package Stringlab;

public class impl_intf implements inter
{
	public String name="swathi";
	public int age=18;
	public char gender='F';
	public impl_intf(String name,int age,char gender)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public String getname()
	{
		return name;
	} 
	public int getage()
	{
		return age;
	}
	public char getgender()
	{
		return gender;
	}
	
}
	 
