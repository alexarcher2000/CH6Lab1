package labs.apcs_ch6_lab_1;

// ****************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople.  Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ****************************************************************
import java.util.Scanner;

public class Sales
{
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {
    	final int SALESPEOPLE = 5;
    	System.out.println("How many salespeople are there?");
    	int numPeople = scan.nextInt();
    	int[] sales = new int[numPeople];
    	int sum;
    	int maxSale = 0;
    	int minSale = 0;
    
    	for (int i=0; i<sales.length; i++)
    	    {
    		System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
    		int entry = scan.nextInt();
    		sales[i] = entry;
    		
    		if (i == 0) 
    		{
    		    maxSale = entry;
    		    minSale = entry;
    		}
    		else if (entry > maxSale) maxSale = entry;
    		else if (entry < minSale) minSale = entry;
    		
    		
    	    }
    
    	System.out.println("\nSalesperson   Sales");
    	System.out.println("--------------------");
    	sum = 0;
    	for (int i=0; i<sales.length; i++)
    	    {
    		System.out.println("     " + (i + 1) + "         " + sales[i]);
    		sum += sales[i];
    	    }
    
    	System.out.println("\nTotal sales: " + sum);
    	System.out.println("Average sales: " + (sum/SALESPEOPLE));
    	System.out.println("Max sale: " + maxSale);
    	System.out.println("Min sale: " + minSale);
    	
    }
}
