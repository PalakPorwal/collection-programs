import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;  
public class Dequeue3 {  
   public static void main(String[] args) {  
	   System.out.println("Palak Porwal, IT-2K19-39");
	    
   Deque<String> deque = new ArrayDeque<String>();  
   deque.add("Ravi");    
   deque.add("Vijay");     
   deque.add("Ajay");    
   
   Iterator<String> itr=deque.iterator();
	while(itr.hasNext())
	{
	System.out.println(itr.next());
	}
   }  
}  
