import java.util.* ;

class ThreeSums
{

  public static void main ( String[] args ) 
  {
    int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};
    
    // declare and initialize three sums
    int sumAll = 0;
    int sumOdd = 0;
    int sumEven = 0;
    
    
    // compute the sums
    for ( int index=0; index < data.length; index++) {
      sumAll = sumAll + data[index];
      if (data[index] % 2 == 1) {
        sumOdd = sumOdd + data[index];
      } else {
        sumEven = sumEven + data[index];
      }
    }
      
    // write out the three sums
    System.out.println("All = " + sumAll + " Odd = " + sumOdd + " Even" + sumEven);

  }
} 