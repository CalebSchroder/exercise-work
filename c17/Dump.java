import java.util.Scanner;
public class Dump {

	public static void main(String[]args) {

		Scanner scan = new Scanner (System.in);
		
		int weight;
        int cost;
       

        

		System.out.println("Enter the weight of the trash in pounds:");
        weight = scan.nextInt();

        cost = 20;
        if (weight > 200) {
            cost = cost + (((weight - 200) / 100) * 8);
        }

        System.out.println("The cost is $" + cost);
	}



}