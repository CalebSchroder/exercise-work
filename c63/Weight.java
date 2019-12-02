import java.util.*;

class Weight
{
  private int[] data;
  
  // Constructor
  public Weight(int[] init) {
    // Make data the same length
    // as the array referenced by init.
    data = new int[init.length];

    
    
    // Copy values from the 
    // input data to data.
    for (int j = 0; j < init.length ; j ++)
    {
      data[j] = init[j];
    }
  }
  
  //Print
  public String toString() {
    String dataOutput = "";
    for (int j = 0; j < data.length; j ++) {
      dataOutput = dataOutput + data[j] + ", ";
    }
    return dataOutput;
  }

  public int average() {
    for ()
  }
 
 
  
}