package assign;

import java.util.ArrayList;
import java.util.List;

public class ListCopy {
	public static void main (String[] args) 
    { 
        // Creating a list 
        List<String> l1 = new ArrayList<String>(); 
        l1.add(0, "tree");  // adds tree at 0 index 
        l1.add(1, "fruit");  // adds fruit at 1 index 
        System.out.println(l1);  // [1, 2] 
  
        // Creating another list 
        List<String> l2 = new ArrayList<String>(); 
        l2.add("leaves"); 
        l2.add("flowers"); 
        l2.add("seeds"); 
  
        // Will add list l2 from 1 index 
        l1.addAll(1, l2); 
        System.out.println(l1); 
  
    }


}
