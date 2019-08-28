import java.util.Scanner;
public class cents
{  
  public static void main ( String[] args )  
  {
    Scanner scan =  new Scanner ( System.in );
    int dollars;
    int cents2;
    int cents;
  

    System.out.println("Enter the data:");

    cents = scan.nextInt();

    dollars = cents/100;
    cents2 = cents%100;

    System.out.println("The dollars is " + dollars);
    System.out.println("The cents is " + cents2);
  }


   
}