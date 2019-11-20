import java.util.Scanner;
public class Odious {

    public static void main (String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scan.nextInt();

        while(n > 0) {

            if (mathy(n)) {

            }
            

        }
    }
    private static long mathy(int number) {
        int binary = 1;
        while (number > 0) {
            binary = number % 2;
            number = number / 2;
            if (binary == 1) {
                return 1;
            } else {
                return 0;
            }

              
        }
        
    }
}