import java.util.* ;

class ReverserVersion1
{

  public static void main ( String[] args ) 
  {
    int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
    
    // reverse the data
    int helper;
    for ( int j = 0; j < data.length / 2 ; j++) {
      helper = data[j];
      data[j] = data[data.length - j - 1];
      data[data.length - j - 1] = helper;
    }
      
    // write out the new data
    for ( int j=0; j < data.length; j++) {
      System.out.println("Element " + j + " = " + data[j]);

    }

  }
}      