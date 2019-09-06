import java.util.Scanner;
public class OrderChecker {

    public static void main(String[]args) {

        Scanner scan = new Scanner (System.in);
        int nuts;
        int bolts;
        int washers;
        int tc;
        System.out.println("Enter the number of nuts:");
        nuts = scan.nextInt();
        System.out.println("Enter the number of bolts:");
        bolts = scan.nextInt();
        System.out.println("Enter the number of washers");
        washers = scan.nextInt();
        if (bolts > nuts) {
            System.out.println("Check the order: Too few nuts");
        } else if ((bolts * 2) > washers) {
            System.out.println("Check the order: Too few washers");
        } else {
            System.out.println("All good");
        }
        tc = (nuts * 5) + (bolts * 3) + (washers);
        System.out.println("The price is $" + tc);



        
        





    }





}