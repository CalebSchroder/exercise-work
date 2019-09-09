import java.util.Scanner;
public class Pie {

	public static void main(String[]args) {

		Scanner scan = new Scanner (System.in);
		int req1;
		int req2;
        int weight;

        

		System.out.println("Enter the weight:");
        weight = scan.nextInt();
       

        

        if (weight > 220 && weight < 280) {
        	System.out.println("Welcome to the pie eating contest");
        } else {
        	System.out.println ("Sorry you are too fat/skinny");
        }






	}



}