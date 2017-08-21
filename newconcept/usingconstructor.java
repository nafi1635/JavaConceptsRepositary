package newconcept;


/**
 * Write a description of class usingconstructor here.
 * 
 * @nAf! 
 * @15/11/15
 */
public class usingconstructor
{
   public String firstname;
   public String lastname;
   public usingconstructor(String firstname,String lastname)
   {
       this.firstname=firstname;
       this.lastname=lastname;
    }
   void show()
   {
       System.out.println(firstname+lastname);
       
    }
}