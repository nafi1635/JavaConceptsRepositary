import javax.swing.*;
public class simpleswing
{
simpleswing()
{
        JFrame jf=new JFrame("SImple");
        jf.setSize(1000,1000);
        JLabel jlab=new JLabel("1.What is the capital city of Telangana?");
        jlab.setBounds(100,500,200,450);
        jf.add(jlab);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String args[])
{
       new simpleswing();
}
}              
