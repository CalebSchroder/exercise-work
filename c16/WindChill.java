import java.util.Scanner;
public class WindChill {

	public static void main(String[]args) {

		Scanner scan = new Scanner (System.in);
		double wc;
        double temp;
        double speed;
		

        

		System.out.println("Enter the temperature in farenheit:");
        temp = scan.nextDouble();
        System.out.println("Enter the wind speed in miles per hour:");
        speed = scan.nextDouble();
       

        

        if (speed < 3) {
            wc = temp;
        } else if (temp > 50) {
            wc = temp;
        } else {
            wc = (35.74 + (0.6125 * temp - (35.75 * Math.pow(speed, 0.16)) + (0.4275 * temp * Math.pow(speed, 0.16))));
        }

        System.out.println("The wind chill is " + wc);
        






	}



}