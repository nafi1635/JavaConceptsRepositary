/**
nAfi
7-02-16
*/
import java.util.*;  
class addallcollectionmethod
{  
 public static void main(String args[])
 {  
        
        System.out.println("Indian Cricket Team 2016T20 world cup");
        System.out.println("1.Batsmans"+"\n"+"2.Bowlers"+"\n"+"3.Allrounders"+"\n"+"4.Exit");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        switch(n)
        {
                case 1:
         ArrayList al=new ArrayList();  
         al.add("Dhoni");  
         al.add("Dhawan");  
         al.add("Rohit"); 
         al.add("Virat kohli"); 
         al.add("Rahane");
         System.out.println("Batsmans List"); 
         Iterator itr1=al.iterator();
         System.out.println("");
           while(itr1.hasNext())
           {
           System.out.println(itr1.next());
           }
           break;
           case 2:
                ArrayList al2=new ArrayList();  
                al2.add("Ashish Nehra");  
                al2.add("Boomrah");  
                al2.add("Mohammad shami");
                 al2.add("Ashwin");
                  al2.add("Harbhajan");
               Iterator itr2=al2.iterator();
               while(itr2.hasNext())
               {
                        System.out.println(itr2.next());
               } 
               break;
               case 3:
               ArrayList al3=new ArrayList();
               al3.add("Raina");
               al3.add("Yuvraj singh");
               al3.add("Jadeja");
               al3.add("Pavan Negi");
               al3.add("Hardik Pandya");
                Iterator itr3=al3.iterator();
                while(itr3.hasNext())
                {
                                System.out.println(itr3.next());
                }
                break;
                case 4:
                        System.out.println("Thank u");
                          
               // case 4:
              //  al.addAll(al2);
               // al.addAll(al3);    //this will add to al2 now output will be total
  
              //  Iterator itr=al.iterator();  
                 //   while(itr.hasNext()){  
               // System.out.println(itr.next());  
              //  break;
              //al.remove(al2);   this is removing elements
  }  
 }  
} 


