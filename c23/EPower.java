import java.util.Scanner;
import java.lang.Math;
public class EPower {


    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double x;
        double sum;
        int n;
        double real;

        System.out.println("Enter x");
        x = scan.nextDouble();

        sum = 1 + x;

        n = 1;        

        while (Math.pow(x, n) / (n *(n - 1) * (n - 2)) >= 0.000000000001) {
            sum = sum + (Math.pow(x, n) / (n * (n - 1) * (n - 2)));
            n = n + 1;
            System.out.println("n: " + n + "Term: " + x + "Sum: " + sum);
        }
        System.out.println("My: " + sum);
        real = Math.exp(x);
        System.out.println("Real: " + real);
        

      
     
      
         


     }
}