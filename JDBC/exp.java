/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.*;

/**
 *
 * @author nafi
 */
public class exp
{

    public static void main(String[] args) 
    {
        System.out.println("Listing all table name in Database!");
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/";
        String db = "timetable";
        String driver = "com.mysql.jdbc.Driver";
        String user = "root";
        String pass = "";
        try
          {
             Class.forName(driver);//register driver class
             con = DriverManager.getConnection(url+db, user, pass);//creating connection
             try
             {
            //DatabaseMetaData dbm = con.getMetaData();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("select day from time;");
             //ResultSet rs = dbm.getTables(null,null,"%",types);//creating stmt
             rs.absolute(3);
             while (rs.next())
             {
                String table = rs.getString("day");
              
                System.out.println(table);
  
             }
             con.close();
            }
            catch (SQLException s)
                     {
                         System.out.println("No any table in the database");
                     }
           }
         catch (Exception e)
         {
            e.printStackTrace();
         }
    }
                   

}

