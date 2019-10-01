import java.util.*;
public class GeussingGame {
    public static void main (String[]args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int n;
        n = rand.nextInt(10);

        for (int count = 1; count < 4; count ++ ) {
            System.out.println("I am thinking of a number from 1 to 10. You must Guess what it is in three tries. Enter a guess");
            int g = scan.nextInt();
            if (n == g) {
                System.out.println("Correct");
                break;
            } else {
                System.out.println("Wrong");
            }

        }

    }
}