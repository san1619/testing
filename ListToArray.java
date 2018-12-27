package assign;

import java.util.ArrayList;
import java.util.List;
import java.util.*; 
import java.util.stream.*; 
  

public class ListToArray {
	

		      // Generic function to convert an Array to List 
		      public static <T> List<T> convertArrayToList(T array[]) 
		      { 
		    
		          // Create the List by passing the Array 
		          // as parameter in the constructor 
		          List<T> list = Arrays.asList(array); 
		    
		          // Return the converted List 
		          return list; 
		      } 
		    
		      public static void main(String args[]) 
		      { 
		          // Create an Array 
		          String array[] = { "Sun", "Moon", 
		                                      "Stars" }; 
		    
		          // Print the Array 
		          System.out.println("Array: " 
		                             + Arrays.toString(array)); 
		    
		          // convert the Array to List 
		          List<String> 
		              list = convertArrayToList(array); 
		    
		          // Print the List 
		          System.out.println("List: " + list); 
		      } 
       } 
 
	  