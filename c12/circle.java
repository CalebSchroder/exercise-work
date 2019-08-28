import java.util.Scanner;
public class circle
{  
  public static void main ( String[] args )  
  {
    Scanner scan =  new Scanner ( System.in );
    int radius;
    double circlelength;

    System.out.println("Enter the data:");

    radius = scan.nextInt();
    circlelength = radius * Math.PI;

    System.out.println("The circle is" + circlelength);
  }


   
}