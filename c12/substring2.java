import java.util.Scanner;
public class substring2
{  
  public static void main ( String[] args )  
  {
    
    
    
    
    String new1;
   
    System.out.println("Enter a string:");
    Scanner scan =  new Scanner ( System.in );
    System.out.println("Enter the beginning index:");
    Scanner slim =  new Scanner ( System.in );
    System.out.println("Enter the ending index:");
    Scanner slam =  new Scanner ( System.in );
    String str = scan.nextLine();
    new1 = str.substring(slim.nextInt(), slam.nextInt());
    

    System.out.println("The new string is " + new1);
    System.out.println("The old string is " + str);

    
  }


   
}