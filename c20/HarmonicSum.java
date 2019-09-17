import java.util.Scanner;
public class HarmonicSum {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int divide;
        int n;
        Double sum;
        
        System.out.println("Enter N");
        n = scan.nextInt();

        divide = 1;
        sum = 0.0;

        while (divide <= n ) {
            sum = sum + (1.0/divide);
            divide = divide + 1;
          
        }

        System.out.println("The sum is " + sum);



         


     }
}