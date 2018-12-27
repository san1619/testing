package assign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListShuffle {
	  public static void main(String[] args) {
		  
	List<Integer> numbers = new ArrayList<Integer>();
	for (int i = -10; i <=10 ; i++) numbers.add(i); 
	System.out.println("Before shuffling: " + numbers);
	Collections.shuffle(numbers);
	System.out.println("After shuffling: " + numbers);
}
}