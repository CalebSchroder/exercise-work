import java.util.Arrays;

class ArrayEquality
{
  public static boolean myEquals( int[] a, int[] b ) {
    if (a.length == b.length) {
      int check = 0;
      for (int j = 0; j < a.length; j ++) {
        if (a[j] == b[j]) {
          check = check + 1;
        }
      }
      if (check == a.length) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  
  }
  
  public static void main ( String[] args ) {
    int[] arrayA = { 1, 2, 3, 4 };
    int[] arrayB = { 1, 2, 3, 4 };
    int[] arrayC = { 6, 2, 7, 4 };
    int[] arrayD = { 1, 6, 3, 5 };
    int[] arrayE = {};
    int[] arrayF = { 1, 2, 3, 4 };
    int[] arrayG = { 1, 2};
    int[] arrayH = { 1, 2};
    int[] arrayJ = {1};
    int[] arrayK = {1};

    System.out.print("Arrays says: ");
    if ( Arrays.equals( arrayA, arrayB ) ) {
      System.out.println( "Equal" );
    } else {
      System.out.println( "NOT Equal" );      
    }

    System.out.print("myEquals says: ");
    if ( myEquals( arrayA, arrayB ) ) {
      System.out.println( "Equal" );
    } else {
      System.out.println( "NOT Equal" );      
    }


    System.out.print("Arrays says: ");
    if ( Arrays.equals( arrayC, arrayD ) ) {
      System.out.println( "Equal" );
    } else {
      System.out.println( "NOT Equal" );      
    }

    System.out.print("myEquals says: ");
    if ( myEquals( arrayC, arrayD ) ) {
      System.out.println( "Equal" );
    } else {
      System.out.println( "NOT Equal" );      
    }


    System.out.print("Arrays says: ");
    if ( Arrays.equals( arrayE, arrayF ) ) {
      System.out.println( "Equal" );
    } else {
      System.out.println( "NOT Equal" );      
    }

    System.out.print("myEquals says: ");
    if ( myEquals( arrayE, arrayF ) ) {
      System.out.println( "Equal" );
    } else {
      System.out.println( "NOT Equal" );      
    }


    System.out.print("Arrays says: ");
    if ( Arrays.equals( arrayG, arrayH ) ) {
      System.out.println( "Equal" );
    } else {
      System.out.println( "NOT Equal" );      
    }

    System.out.print("myEquals says: ");
    if ( myEquals( arrayG, arrayH ) ) {
      System.out.println( "Equal" );
    } else {
      System.out.println( "NOT Equal" );      
    }


    System.out.print("Arrays says: ");
    if ( Arrays.equals( arrayJ, arrayK ) ) {
      System.out.println( "Equal" );
    } else {
      System.out.println( "NOT Equal" );      
    }

    System.out.print("myEquals says: ");
    if ( myEquals( arrayJ, arrayK ) ) {
      System.out.println( "Equal" );
    } else {
      System.out.println( "NOT Equal" );      
    }
  }
}