//*************************************************************** 
//Sales.java
//
//Reads in and stores sales for each of 5 salespeople. Displays
//sales entered by salesperson id and total sales for all salespeople.
//
//*************************************************************** 
import java.util.Scanner;
public class Sales 
{
    public static void main(String[] args) 
    {
        //final int SALESPEOPLE = 5;
        int salesPeople = 0;
        //int[] sales = new int[SALESPEOPLE];
        int sum;
        int maxSale = 0;
        int maxPerson = 0;
        int minSale = 0;
        int minPerson = 0;
        int benchAmount = 0;
        int totalExceeded = 0;
        
        Scanner scan = new Scanner(System.in); 
        System.out.println("How many sales people? ");
        salesPeople = scan.nextInt();
        int[] sales = new int[salesPeople];
        
        for (int i=0; i<sales.length; i++) 
        {
            System.out.print("Enter sales for salesperson " + (i + 1) + ": "); 
            sales[i] = scan.nextInt(); 
            if(sales[i] > maxSale) {
                maxSale = sales[i];
                maxPerson = i;
            }
            if(i == 0 || sales[i] < minSale) {
                minSale = sales[i];
                minPerson = i;
            }
        }
        System.out.println("\nSalesperson Sales");
        System.out.println(" ------------------ ");
        sum = 0;
        for (int i=0; i<sales.length; i++) 
        {
            System.out.println(" " + (i + 1) + " " + sales[i]); 
            sum += sales[i]; 
        }
        System.out.println("\nTotal sales: " + sum); 
        System.out.println("Average sale: " + (sum/sales.length));
        System.out.println("Salesperson " + (maxPerson + 1) + " had the highest sale with $" + maxSale);
        System.out.println("Salesperson " + (minPerson + 1) + " had the lowest sale with $" + minSale);
        
        System.out.println("\nEnter a bench amount, to see who sold more than that: ");
        benchAmount = scan.nextInt();
        System.out.println("\nThese sales people exceeded your bench amount:");
        for (int i=0; i<sales.length; i++) {
            if(sales[i] >= benchAmount) {
                totalExceeded++;
                System.out.println("Salesperson " + (i + 1) + " had sales of: $" + sales[i]);
            }
        }
        System.out.println("\n" + totalExceeded + " sales people exceeded your bench amount of $" + benchAmount);
        
        scan.close();
    } 
} 