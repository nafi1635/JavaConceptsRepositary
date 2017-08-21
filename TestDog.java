
/**
 * Write a description of class j here.
 * 
 * @nafi
 * @
 */

    class j{

   public void move(){
      System.out.println("Animals can move");
   }
}

class dog extends j{

   public void move(){
System.out.println("Dogs can walk and run");
   }
   void over(String s)
   {
       System.out.println("this is overloaded method");
    }
}

public class TestDog{

   public static void main(String args[]){
      j a = new j(); // Animal reference and object
      dog b = new dog(); // Animal reference but Dog object

      a.move();// runs the method in Animal class

   
      b.move();//Runs the method in Dog class
    

   }
}