package labs.apcs_ch6_lab_1;
import java.util.Scanner;

/**
 * Write a description of class Histogram here.
 * 
 * @author D. Appel
 * @version (a version number or a date)
 */
public class Histogram
{
    // instance variables - replace the example below with your own
    private int[] values;  //store values entered by user
    private int size; //How many entries are needed
    Scanner scan = new Scanner(System.in);

    /**
     * Constructor for objects of class Histogram
     */
    public Histogram(int numEntries)
    {
        // initialise instance variables
        size = numEntries;
        values = new int[numEntries];
    }

    public void setValues()
    {
        for (int i = 0; i < size; i++)
        {
            System.out.println("Enter value between 1 and 50 (inclusive): ");
            int entry = scan.nextInt();
            values[i] = entry;
        }
    }
    
    public void createHistogram()
    {
        
        int[] temp = new int[5];  //Stores the counts for each interval (5 in this case)
        
        for (int j = 0; j < size; j++)
        {
            if (values[j] < 10) temp[0]++;
            else if (values[j] < 20) temp[1]++;
            else if (values[j] < 30) temp[2]++;
            else if (values[j] < 40) temp[3]++;
            else temp[4]++;
        }
        
        printNumbers(temp);
        System.out.println();
        printHistogram(temp);
        
    }
    
     public void printNumbers(int[] gram)
    {
        for (int i = 0; i < gram.length ; i++)
        {
            System.out.print("Values in Range " + 10*i +" to " + (10*i + 9) + ": ");
            if (gram[i] !=0)
            {
                System.out.println(gram[i]);
            }
            else {System.out.println(0);}
        }
    }
    
    public void printHistogram(int[] gram)
    {
        for (int i = 0; i < gram.length ; i++)
        {
            System.out.print("Values in Range " + 10*i +" to " + (10*i + 9) + ": ");
            if (gram[i] !=0)
            {
                for (int j = 0; j < gram[i]; j++)
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
