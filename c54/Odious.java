import java.util.Scanner;
public class Odious {

    public static void main (String[]args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a number");
        int n = scan.nextInt();

        while(n >= 0) {

            if (mathy(n) % 2 == 1) {
                System.out.println("Odious");
            } else {
                System.out.println("Evil");
            }         
            System.out.println("Enter a number");
            n = scan.nextInt();
        }
        System.out.println("bye");
    }
    private static long mathy(int number) {
        int binary = 1;
        int count = 0;
        while (number > 0) {
            binary = number % 2;
            number = number / 2;
            if (binary == 1) {
                count = count + 1;
            } else {
                count = count + 0;
            }

              
        }
        return count;
        
    }
}