import java.util.* ;

class NearlyZero
{

  public static void main ( String[] args )
  {
    int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
    
    // declare and initialize variables
    int absvalue = 0;
    int nearest = Math.abs(data[0]);
    
    
    // find the element nearest to zero
    for (int index = 0; index < data.length; index++) {
      absvalue = Math.abs(data[index]);
      if (absvalue < nearest) {
        nearest = absvalue;
      } 
    }
      
    // write out the element nearest to zero
    System.out.println("The element closest to zero is " + nearest );

  }
}      