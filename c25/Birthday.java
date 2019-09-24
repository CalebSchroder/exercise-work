import java.util.Scanner;
public class Birthday {
    public static void main (String[]args) {

        Scanner scan = new Scanner(System.in);
        int n;
        int count;
        double chance;

        System.out.println("enter n");
        n = scan.nextInt();

        chance = 1.0;


        for (count = 1; count <= n; count++) {

            chance = (365 - count)/ 365.0;

        }

        System.out.println("Chance = " + chance);
        
    
   
    }
}