import java.util.Scanner;
public class logs
{  
  public static void main ( String[] args )  
  {
    Scanner scan =  new Scanner ( System.in );
    double input;
    double output
    ;
  

 

    System.out.println("Input:");

    input = scan.nextDouble();


    output = Math.log( input ) / Math.log( 2.0 );

    System.out.println("Output: " + output);

    
  }


   
}


//Math.log( X ) / Math.log( 2 )