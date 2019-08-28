import java.util.Scanner;
public class applianceCost
{  
  public static void main ( String[] args )  
  {
    Scanner scan =  new Scanner ( System.in );
    double price;
    double price1;
    double hours;
    double cost;
  

    System.out.println("Enter price per kilowatt-hour in cents:");

    price = scan.nextDouble();

    System.out.println("Enter kilowatt hours used per year:");

    hours = scan.nextDouble();

    price1 = price/100;
    cost = price1 * hours;

    System.out.println("Annual Cost is is $" + cost);

    
  }


   
}