package assign;

import java.util.Scanner;

public class Hourg {
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		int[][] values = new int[6][6];
		int h= Integer.MIN_VALUE;
		int b;
		
		
		for (int r=0; r<6; r++)
		{
		for (int c=0; c<6; c++)
		{
		values[r][c]=input.nextInt();
		}
		
		}
        for (int r=0; r<4; r++)
        {
        for (int c=0; c<4; c++)
        {
        	b= values[r][c]+values[r][c+1]+values[r][c+2]
        			+values[r+1][c+1]+
        	   values[r+2][c]+values[r+2][c+1]+values[r+2][c+2];
        	
        	h=Math.max(b,h);
        	
        }
        }
           System.out.println(h);
	}
	
	}
	
