import java.util.*;
public class RandomWalk {
    public static void main (String[]args) {
        Random rand = new Random();
        double x = 0.0;
        double y = 0.0;
        double distance;

        for(int count = 0; count < 10; count ++) {
            x = x + (2 * rand.nextDouble() - 1.0);
            y = y + (2 * rand.nextDouble() - 1.0);
        }
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        distance = Math.sqrt((x * x) + (y * y));
        System.out.println("Distance: " + distance);




    }
}