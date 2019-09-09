import java.util.Scanner;
public class LastChance {

	public static void main(String[]args) {

		Scanner scan = new Scanner (System.in);
		int tc;
		int gg;
		int mpg;

		System.out.println("Enter the tank capacity:");
        tc = scan.nextInt();
        System.out.println("Enter the gauge reading:");
        gg = scan.nextInt();
        System.out.println("Enter the miles per gallon:");
        mpg = scan.nextInt();

        gg = gg / 100;

        if (((tc * gg) * mpg) <200 ) {
        	System.out.println("Get gas!");
        } else {
        	System.out.println ("Safe to proceed");
        }






	}



}