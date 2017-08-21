package lab5;
public class employee extends person
{
	
	private String title;
	private String department;
	private float  salary;                                                        
public employee(String f,String l,int a,String t,float s,String d)
	{
		super(f,l,a);
		title=t;
		salary=s;
		department=d;
		
	}
void  salary(float s)
{
    
}
void title(String t)
{
    
}
void department(String d)
{
   
}
void display()
{ 
    super.display();
  System.out.println("He is "+title+" "+"\n"+"His salary is "+salary+"\n"+"He background department is   "+department);
  
}
}
