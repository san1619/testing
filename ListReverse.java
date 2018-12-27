package assign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListReverse {
	
	  public static void main(String[] args) {
	
	List<Integer> numbers = new ArrayList<Integer>();
	for (int i = -10; i <= 10; i++) numbers.add(i);
	System.out.println("Before reversing: " + numbers);
	Collections.reverse(numbers);
	System.out.println("After reversing: " + numbers);

}
}