import java.util.*;
public class Sqrt {
    public static void main (String[]args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int rounds;
        String user1;
        String user2;
        int score1 = 0;
        int score2 = 0;

        System.out.println("How many rounds?");
        rounds = scan.nextInt();

        System.out.println("Player 1 Username:");
        user1 = scan.next();

        System.out.println("Player 2 Username:");
        user2 = scan.next();



        for (int count = 0; count < rounds; count ++) {
            if (count % 2 == 0 ) {
                double sqrt = 99.9 * rand.nextDouble() + 1.0;
                System.out.println("What is the Square root of " + sqrt);
                System.out.println(user1 + ", your guess: ");
                double guess1 = scan.nextDouble();
                System.out.println(user2 + ", your guess: ");
                double guess2 = scan.nextDouble();
                double close1 = Math.abs(Math.sqrt(sqrt) - guess1);
                double close2 = Math.abs(Math.sqrt(sqrt) - guess2);
                System.out.println("The correct answer is " + Math.sqrt(sqrt));
                System.out.println(user1 + " is " + close1 + " away");
                System.out.println(user2 + " is " + close2 + " away");
                if (close1 < close2) {
                    System.out.println(user1 + " wins!");
                    score1 ++;
                } else {
                    System.out.println(user2 + " wins!");
                    score2 ++;
                }
            } else {
                double sqrt = 99.9 * rand.nextDouble() + 1.0;
                System.out.println("What is the Square root of " + sqrt);

                System.out.println(user2 + ", your guess: ");
                double guess2 = scan.nextDouble();

                System.out.println(user1 + ", your guess: ");
                double guess1 = scan.nextDouble();

                double close1 = Math.abs(Math.sqrt(sqrt) - guess1);
                double close2 = Math.abs(Math.sqrt(sqrt) - guess2);

                System.out.println("The correct answer is " + Math.sqrt(sqrt));

                System.out.println(user1 + " is " + close1 + " away");
                System.out.println(user2 + " is " + close2 + " away");

                if (close1 < close2) {
                    System.out.println(user1 + " wins!");
                    score1 ++;
                } else {
                    System.out.println(user2 + " wins!");
                    score2 ++;
                }
            }
            
        }
        System.out.println("Final score: " + user1 + ": " + score1 + " " + user2 + ": " + score2);

    }
}