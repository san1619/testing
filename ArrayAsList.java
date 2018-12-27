package assign;

import java.util.Arrays;
import java.util.List;

public class ArrayAsList {
	
	  public static void main(String[] args) {
		  
	  // Arrays.asList is a method used to convert Arrays to List
	List<String> listWords = Arrays.asList("Red", "Blue", "Orange", "Peach", "Yellow", "White");
	List<Integer> listNumbers = Arrays.asList(1, 3, 5, 7, 9, 2, 4, 6, 8);
	System.out.println("Array: "+listWords);
	System.out.println("List: "+listNumbers);
    }
}