import java.util.Scanner;
public class age {

	public static void main(String[]args) {

		Scanner scan = new Scanner (System.in);
        double years;
        double months;
        double days;
        double seconds;
        double percent;

        

		System.out.println("Enter the years:");
        years = scan.nextDouble();
        System.out.println("Enter the months:");
        months = scan.nextDouble();
        System.out.println("Enter the days:");
        days = scan.nextDouble();


        seconds = (years * 365 * 24 * 60) + (months * 30 * 24 * 60) + (days * 24 * 60);
        percent = seconds / 2500000000.0;

        System.out.println("You lived " + seconds);
        System.out.println("You this much of your estimated life " + percent);
        


       

        

      






	}



}