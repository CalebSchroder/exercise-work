import java.util.Random;
import java.util.Scanner;
public class Multiply {


    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int questions;
        int num1;
        int num2;
        int ans;

        questions = 1;

        while (questions <= 10) {
            questions = questions + 1;
            num1 = rand.nextInt(9);
            num2 = rand.nextInt(9);
            System.out.println("What is" + num1 + "*" + num2);
            ans = scan.nextInt();
            if (ans == (num1 * num2)) {
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong!");
            }
        }
        

      
     
      
         


     }
}