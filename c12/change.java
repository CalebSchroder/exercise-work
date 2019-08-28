import java.util.Scanner;
public class change
{  
  public static void main ( String[] args )  
  {
    Scanner scan =  new Scanner ( System.in );
 
    int cents;
    int dollars;
    int quarters;
    int dimes;
    int nickels;
    int pennies;
  

    System.out.println("Enter the data:");

    cents = scan.nextInt();
    dollars = cents/100;
    quarters = cents%100/25;
    dimes = cents%100%25/10;
    nickels = cents%100%25%10/5;
    pennies = cents%100%25%10%5/1;

    System.out.println("Dollars is " + dollars);
    System.out.println("Quarters is " + quarters);
    System.out.println("Dimes is " + dimes);
    System.out.println("Nickels is " + nickels);
    System.out.println("Pennies is " + pennies);

    

    
  }


   
}
