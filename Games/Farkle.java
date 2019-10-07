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
        

        
        

    }
}