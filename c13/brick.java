import java.util.Scanner;
public class brick
{  
  public static void main ( String[] args )  
  {
    Scanner scan =  new Scanner ( System.in );
    double D;
    double T;
    double G;

    G = 32.174;

    System.out.println("Enter time in second:");

    T = scan.nextDouble();


    D = (1.0/2) * G * (T * T);

    System.out.println("Distance: " + D);

    
  }


   
}