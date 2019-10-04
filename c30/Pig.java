import java.util.*;
public class Pig {
    public static void main (String[]args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        
        int scoreComp = 0;
        int scorePlay = 0;

        while (scoreComp < 100 && scorePlay < 100) {
            System.out.println("The computer is taking its turn!");
            int dice1 = rand.nextInt(6) + 1;
            int dice2 = rand.nextInt(6) + 1;
            int dice3 = rand.nextInt(6) + 1;

            int turnScore = 0;
            int y = 1;

            scoreComp = scoreComp + dice1 + dice2 + dice3;
            System.out.println("The computer now has " + scoreComp + " points. Your turn!");
           
            while (y == 1) {
                int pDice = rand.nextInt(6) + 1;
                if (pDice == 1) {
                    turnScore = 0;
                    System.out.println("You rolled a 1, you lost all of your points for this turn and your turn is over");
                    break;
                } else {
                    turnScore = turnScore + pDice;
                    System.out.println(pDice + " points added to score");
                }
                System.out.println("Go again? 1 = Yes. Anything else equals no");
                y = scan.nextInt();
            }
            scorePlay = scorePlay + turnScore;
            System.out.println("Your turn has ended. You have " + scorePlay + " points");
        }
        System.out.println("Game over, final score = Computer: " + scoreComp + " Player: " + scorePlay); 

    }
}