import java.util.Scanner;
public class Harmonic
{  
  public static void main ( String[] args )  
  {
    Scanner scan =  new Scanner ( System.in );
    double x;
    double y;
    double h;
    double a;
    
  

 

    System.out.println("Input X:");

    x = scan.nextDouble();
    
    System.out.println("Input Y:");

    y = scan.nextDouble();


    h = 2/(1/x + 1/y);
    a = (x + y)/2;

    System.out.println("Harmonic Mean: " + h);
    System.out.println("Arithmetic Mean: " + a);

    
  }


   
}