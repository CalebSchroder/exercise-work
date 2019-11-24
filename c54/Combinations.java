import java.util.*;
public class Combinations {

	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int r;
		int n;

		System.out.println("Enter n");
		n = scan.nextInt();
		System.out.println("Enter r");
		r = scan.nextInt();

		int answer;
		answer = factorial(n) / (factorial(r) * factorial (n - r));

		System.out.println("The number of combinations is " + answer);






	}

	public static int factorial( int num ) {
    	int fct = 1;
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