package assign;

import java.util.ArrayList;
import java.util.List;

public class ListSearch {

	// Java program to demonstrate search 
	// operations on List interface 
 
	  
	    public static void main(String[] args) 
	    { 
	        // Type safe array list, stores only string 
	        List<String> l = new ArrayList<String>(5); 
	        l.add("Apple"); 
	        l.add("Mango"); 
	        l.add("Grape"); 
	  
	        // Using indexOf() and lastIndexOf() 
	        System.out.println("first index of Apple:" + 
	                                l.indexOf("Apple")); 
	        System.out.println("last index of Grape:" + 
	                            l.lastIndexOf("Grape")); 
	        System.out.println("Index of element"+ 
	            " not present : " + l.indexOf("Hello")); 
	    } 
	} 




