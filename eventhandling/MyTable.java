import javax.swing.*;  
public class MyTable 
{  
	   JFrame f;  
	  MyTable()
	  {  
    		f=new JFrame();  
      
    		String data[][]={ {"1","nafi","100000000"},  
              			{"2","nazeem","10000000"},  
                          {"3","nazzu","700000"}};  
    		String column[]={"s.no","NAME","salary"};  
      
    		JTable jt=new JTable(data,column);  
    		jt.setBounds(30,40,200,300);  
      
    		JScrollPane sp=new JScrollPane(jt);  
    		f.add(sp);  
      
    		f.setSize(500,500);  //this is on the frame so because layout shoulid be null
// f.setLayout(null);  
    			f.setVisible(true);  
}  
public static void main(String[] args) 
	{  
	    new MyTable();  
	}  
} 
