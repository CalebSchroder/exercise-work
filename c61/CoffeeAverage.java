import java.util.* ;

public class CoffeeAverage {

	public static void main(String[] args) {


		double[] coffee = {5.6, 6.2, 6.0, 5.5, 5.7, 6.1, 7.4, 5.5, 5.5, 6.3, 6.4, 4.0, 6.9};
		double[] coffee2 = new double[coffee.length];

		double average;
		double total = 0;;

		for(int j = 0; j < coffee.length; j ++) {
			total = total + coffee[j];
		}

		average = total / coffee.length;

		System.out.println("Average = " + average);

		double close;
		double farthest = 0.0; 
		double most = 0.0;

		for (int j = 0; j < coffee.length; j ++) {
			close = Math.abs(coffee[j] - average);

			if (close > farthest) {
				farthest = close;
				most = coffee[j];
			} 
		}

		System.out.println("Most distant value = " + most);

		double newAverage = (total - most) / (coffee.length - 1);

		System.out.println("New average = " + newAverage); 
	}
}