import java.util.Scanner;
public class SeperatedWords {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int count;
        int add;
        int sum;
        int yeet;

        System.out.println("Enter amount of integers");
        count = scan.nextInt();

        yeet = 0;
        sum = 0;
        add = 0;

        while (yeet <= count ) {
            System.out.println("Enter int");
            add = scan.nextInt();
            sum = sum + add;
            yeet = yeet + 1;
        }

        System.out.println("The sum is" + sum);



         


     }
}