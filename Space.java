package assign;
import java.util.Scanner;

public class Space {

	    public static void main(String[]args)
	    {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter the string...");
	        String s1=sc.nextLine();
	        int l=s1.length();
	        int count=0;
	        for(int i=0;i<l;i++)
	        {
	            char c=s1.charAt(i);
	            if(c==' ')
	            {
	            System.out.println("spaces are in the position of "+i);
	            System.out.println(count++);
	            }
	            else
	            {
	            System.out.println("no spaces are there");
	        }

}
	    }
	  
	    }
