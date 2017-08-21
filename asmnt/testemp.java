package asmnt;

public class testemp
{
	public static void main(String args[])
{
	emp e1=new emp("algota","devender",500000,1354);
	emp e2=new emp("gadapa","vinith",500000,1399);
	System.out.println("first employee  details.......");
	System.out.println(" name  :"+e1.getname());
	System.out.println(" id:"+e1.getid());	
	System.out.println(" salary:"+e1.getsalary());
	System.out.println("second  employee  details.......");
	System.out.println(" name  :"+e2.getname());
	System.out.println(" id:"+e2.getid());	
	System.out.println(" salary:"+e2.getsalary());
	
}
}
