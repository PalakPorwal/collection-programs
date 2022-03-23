import java.util.*;
public class ArrayList1 {
	
	public static void main(String args[])
	{
		 System.out.println("Palak Porwal, IT-2K19-39");
	       
	ArrayList<String> al=new ArrayList<>();
	al.add("palak");
	al.add("arav");
	Iterator<String> itr=al.iterator();
	while(itr.hasNext())
	{
	System.out.println(itr.next());
	}
	}
}
