import java.util.*;  
class queueinterface{  
public static void main(String args[]
){  
  
PriorityQueue queue=new PriorityQueue();  
queue.add("Ronaldo");  
queue.add("Messi");  
queue.add("Neymar");  
queue.add("Hazard");  
queue.add("Rooney");  
  
System.out.println("head:"+queue.element());  
System.out.println("head:"+queue.peek());  
  
System.out.println("iterating the queue elements:");  
Iterator itr=queue.iterator();  
while(itr.hasNext())
{  
System.out.println(itr.next());  
}  
  
queue.remove();  
queue.poll();  
  
System.out.println("after removing two elements:");  
Iterator itr2=queue.iterator();  
while(itr2.hasNext()){  
System.out.println(itr2.next());  
}  
  
}  
}  
