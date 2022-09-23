package comp1000_pa1;

import java.util.*;

public class PA1a {
	public static void main(String[] args) 
	{
		int inches = 0;
	    Scanner stdin = new Scanner(System.in);
	    
	    System.out.print("Enter number of yards: ");
		inches += 36*Integer.parseInt(stdin.nextLine());
		
	    System.out.print("Enter number of feet: ");
		inches += 12*Integer.parseInt(stdin.nextLine());
		
	    System.out.print("Enter number of inches: ");
		inches += Integer.parseInt(stdin.nextLine());
		
		System.out.println("Total number of inches: " + String .valueOf(inches));
		
		stdin.close();
	}   
}
