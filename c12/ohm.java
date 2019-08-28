import java.util.Scanner;
public class ohm
{  
  public static void main ( String[] args )  
  {
    Scanner scan =  new Scanner ( System.in );
    int R;
    int V;
    double I;
  

    System.out.println("Enter Resistance:");

    R = scan.nextInt();

    System.out.println("Enter Voltage");

    V = scan.nextInt();

    I = (V + 0.0)/R;

    System.out.println("Current is " + I);

    
  }


   
}