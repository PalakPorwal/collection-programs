
// Java Program Demonstrate add()
// method of BlockingQueue
 
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.BlockingQueue;
 
public class BlockingQueue2 {
   
    public static void main(String[] args)
        throws IllegalStateException
    {
    	System.out.println("Palak Porwal, IT-2K19-39");
        // create object of BlockingQueue
        BlockingQueue<Integer> BQ
            = new LinkedBlockingDeque<Integer>();
 
        // Add numbers to the BlockingQueue
        BQ.add(7855642);
        BQ.add(35658786);
        BQ.add(5278367);
        BQ.add(74381793);
 
        // before removing print BlockingQueue
        System.out.println("Blocking Queue: " + BQ);
    }
}