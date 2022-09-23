package comp1000_pa1;

import java.util.*;

public class PA1b {
	public static void main(String[] args) 
	{
		int inches = 0;
	    Scanner stdin = new Scanner(System.in);
	    
	    System.out.print("Enter number of inches: ");
		inches = Integer.parseInt(stdin.nextLine());
		
	    System.out.println("Yards: " +(int) Math.floor(inches/36));
	    System.out.println("Feet: " + (int) Math.floor((inches%36)/12));
	    System.out.println("Inches: " + (inches%36)%12);
	    
	    stdin.close();
	}   
}
