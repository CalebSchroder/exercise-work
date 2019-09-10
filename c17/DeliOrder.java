import java.util.Scanner;
public class DeliOrder {

	public static void main(String[]args) {

		Scanner scan = new Scanner (System.in);
		String name;
		double price;
        double total;
        double od;

        

		System.out.println("Enter the item:");
        name = scan.nextLine();
        System.out.println("Enter the price:");
        price = scan.nextDouble();
        System.out.println("Express Delivery?:");
        od = scan.nextDouble();

        

        if (price < 10) {
            total = 2;
        } else {
            total = 0;
        }

        if (od == 1) {
            total = total + 3;
        }

        total = total + price;

        System.out.println("Total is : "+ total);
        System.out.println("Food : " + name );






	}



}