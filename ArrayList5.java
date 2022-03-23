import java.util.ArrayList;
  
// Main class
public class ArrayList5 {
  
    // Main driver method
    public static void main(String[] args)
    {
        // Creating an empty Integer ArrayList
        ArrayList<Integer> arr = new ArrayList<Integer>(4);

        // Adding elements to above ArrayList
        // using add() method
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println("Palak Porwal, IT-2K19-39");
        // Printing the elements inside current ArrayList
        System.out.println("The list initially: " + arr);
  
        // Clearing off elements
        // using clear() method
        arr.clear();
  
        // Displaying ArrayList elements
        // after using clear() method
        System.out.println(
            "The list after using clear() method: " + arr);
    }
}