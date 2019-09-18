import java.util.Scanner;
public class Power {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Double x;
        int n;
        int sum;
        Double yeet;
       

        System.out.println("Enter x");
        x = scan.nextDouble();
        System.out.println("Enter N");
        n = scan.nextInt();

        sum = 1;
        yeet = 0.0;

        while (sum <= n && n >= 0) {
            yeet =  yeet + (x * x);
            sum = sum + 1;
        }
        if (n <= 0) {
            System.out.println("N must be positive");
        }

        System.out.println("The sum is " + yeet);



         


     }
}