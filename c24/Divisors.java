import java.util.Scanner;
public class Divisors {
    public static void main (String[]args) {

        Scanner scan = new Scanner(System.in);
        
        int n;
        int count;
        int sum;
        int excess;

        System.out.println("Enter N");
        n = scan.nextInt();

        sum = 0;

        for (count = 1; count <= (n/2); count++) {
            excess = n % count;
            if (excess == 0) {
                sum = sum + count;
            }
        }

        System.out.println("Sum = " + sum);
        if (n == sum) {
            System.out.println("N is perfect!");
        }


   
    }
}