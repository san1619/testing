package assign;
import java.util.*;

public class ListSort {
	
	public static <Interger> void main (String[] args) {
	
	
		List<Integer> listIntegers = Arrays.asList(1, 6, 9, 3, 2, 0, 8, 4, 7, 5);
		 
		System.out.println("Before sorting: " + listIntegers);
		 
		Collections.sort(listIntegers);
		 
		System.out.println("After sorting: " + listIntegers);
	}
	
}