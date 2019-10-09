import java.util.*;
public class Pig {
    public static void main (String[]args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        String user1;
        String user2;
        String order1;
        int order2;

        System.out.println("User 1 and User 2, I am rolling your dice to determine your turn order");
        order1 = rand.nextint(6) + 1;
        order2 = rand.nextint(6) + 1;
        if (order1 >= order2) {
            System.out.println("User 1 you are player 1 and user 2 you are player 2");
        } else {
            System.out.println("User 2 you are player 1 and user 1 you are player 2");
        }

        System.out.println("Player 1 Enter your username");
        user1 = scan.nextInt();
        System.out.println("Player 2 Enter your username");
        user2 = scan.nextInt();

        int score1 = 0;
        int score2 = 0;

        while (score1 < 10000 && score2 10000) {
            int stay = 1;

            int d1;
            int d2;
            int d3;
            int d4;
            int d5;
            int d6;
            while (stay == 1) {
                int turnScore = 0;

                int[] dice = new dice[6];
                dice[0] = rand.nextInt(6);
                dice[1] = rand.nextInt(6);
                dice[2] = rand.nextInt(6);
                dice[3] = rand.nextInt(6);
                dice[4] = rand.nextInt(6);
                dice[5] = rand.nextInt(6);

                int pull = 1;

                while (pull == 1) {
                    System.out.println("What points do you want to remove?// 1 Dice = 1 // 5 Dice = 5 // 3 of a kind = 3 //");
                    int dpull = scan.nextInt();
                    
                    int threes;
                    
                   for (int i = 0; i < 6; i++) {
                       if (dice[i] == )
                   } 
                    
                    if (threes >= 3) {

                    }
                    
                    
                    

                    

                }

                
                    
                
            }
        }
    }
}