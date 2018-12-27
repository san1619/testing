package assign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListCopytwo {
	  
	
	public static void main(String[] args) {
	
	// The first list we will label as source list	
	List<String> sourceList = new ArrayList<String>();
	sourceList.add("Jimmy");
	sourceList.add("went");
	sourceList.add("to");
	sourceList.add("school");
	
	
	// The second list we take is the destination list
	List<String> destList = new ArrayList<String>();
	destList.add("A");
	destList.add("B");
	destList.add("C");
	destList.add("D");
	destList.add("today");
	System.out.println("destList before copy: " + destList); // Here we are printing destination list before any change
	
	Collections.copy(destList, sourceList);                 // By using this command we are placing our first table i.e...
	                                                       //...source list into destination list
	
	System.out.println("destList after copy: " + destList); // Here we get the final output after copying source list... 
	                                                       //...into destination list
   
	}

}