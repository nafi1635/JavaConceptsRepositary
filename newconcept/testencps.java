package newconcept;


/**
 * Write a description of class testencps here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class testencps
{
     public static void main(String args[]){
      encapsulation encap = new  encapsulation();
      encap.setName("James");
      encap.setAge(20);
      encap.setIdNum("12343ms");

      System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());
    }
}