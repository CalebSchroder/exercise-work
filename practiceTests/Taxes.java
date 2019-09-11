import java.util.Scanner;
public class Taxes {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

         double income;
         double tax;
         double percent;

         System.out.println("Enter Income:");
         income = scan.nextDouble();

         if(income >= 105000) {
             tax = ((income - 105000) * 0.22) + (40000 * 0.19) + (30000 * 0.16) + (20000 * 0.1);
         }
         else if(income >= 65000 && income < 105000) {
             tax = ((income - 65000) * 0.19) + (30000 * 0.16) + (20000 * 0.1);
         }
         else if(income >= 35000 && income < 65000) {
             tax = ((income - 35000) * 0.16) + (20000 * 0.1);
         }
         else if(income >= 15000 && income < 35000) {
             tax = ((income - 15000) * 0.1);
         }
         else {
             tax = 0;
         }

         System.out.println("Tax is " + tax);
         percent = (tax / income) * 100;
         System.out.println("Percent of income is " + percent);
    }

}