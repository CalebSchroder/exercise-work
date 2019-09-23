import java.util.Scanner;
public class sumOdd {
    public static void main (String[]args) {
        
        Scanner scan = new Scanner(System.in);
        int n;
        int count;
        int sum;
        int power;
        
        System.out.println("Enter n");
        n = scan.nextInt();

        sum = 0;

        for(count = 1; count <= n; count = count + 2) {
            sum = sum + count;
        }

        System.out.println("Sum of odds = " + sum);

        power = n * n;

        System.out.println("n squared = " + power);
    }
}