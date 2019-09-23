
public class Sheep {
    public static void main (String[]args) {
        
        int n;
        int t;
        double power;
        power = 1;

        for (t = 0; t <= 25; t++ ) {
            power = power * 0.83;
            n = (int)(220/(1 + 10 * power));
            System.out.println("Year " + t + " = " + n);
        }
   
    }
}