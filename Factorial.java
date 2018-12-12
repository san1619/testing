package assign;
import java.io.*;
import java.util.Scanner;
public class Factorial {
	 public static int factorial(int n){
	        if(n<=1){
	            return 1;
	        } 
	        else {
	            return n * factorial(n-1);
	        }
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number whose factorial is to be found: ");
	        int m = sc.nextInt();
	        System.out.println(factorial(m));
	    }
	}