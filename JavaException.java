package assign;

     
    //A Class that represents use-defined exception
	class JavaException extends Exception {
	 
	  
	     public JavaException(String s) 
	     { 
	         // Call constructor of parent Exception 
	         super(s); 
	     } 
	 
	   
	 // A Class that uses above JavaException 
	      
	     
		 // Driver Program 
	     public static void main(String args[]) 
	     { 
	         try
	         { 
	             // Throw an object of user defined exception 
	             throw new JavaException("Good"); 
	         } 
	         catch (JavaException ex) 
	         { 
	             System.out.println("Morning"); 
	   
	             // Print the message from JavaException object 
	             System.out.println(ex.getMessage()); 
	         } 
	     } 
	     }

