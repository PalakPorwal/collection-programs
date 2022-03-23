import java.util.*;  
public class Dequeue1 {  
   public static void main(String[] args) {  
   Deque<String> deque = new ArrayDeque<String>();  
   System.out.println("Palak Porwal, IT-2K19-39");
   
   deque.add("Ravi");    
   deque.add("Vijay");     
   deque.add("Ajay");    
   //Traversing elements  
   for (String str : deque) {  
   System.out.println(str);  
   }  
   }  
}  
