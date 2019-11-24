import java.util.*;

public class Factorial {
    
    public static void main(String[]args) {
        Scanner scan = new Scanner( System.in );
        long fact; 
        int N = 1;

        while (factorial(N) >= 0){
        	System.out.println( "To exit, enter a negative value" );
        	System.out.print( "Enter N: " );
        	N = scan.nextInt();
        	if (N < 0) {
        		System.out.println("Bye");
        		break;
        	}

        	if ( factorial(N) <= 0 ) {
        		System.out.println("Too big or too small");
        	} else {
        		fact = factorial( N );
        		System.out.println( "factorial is " + fact );
        		System.out.print( "Enter N: " );
        		N = scan.nextInt();
    		}
    	}
    }

    

    public static long factorial( int num ) {
    	long fct = 1;
    	if (num >= 20) {
        	return -1;
    	} else if (num <= 0 ) {
        	return -1;
    	} else {
    
    		for ( int j=1; j<=num; j++ ) {
      			fct *= j;
    		}
		}
    	return fct;
  	}
} 