import java.util.Scanner;
public class Sum {


     public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);

         int n;
         int loopSum;
         int formulaSum;

        
         System.out.println("Enter N");
         n = scan.nextInt();

         loopSum = 1;
         

         while (loopSum <= n) {
             loopSum = loopSum + loopSum;
         }

         System.out.println("Loop sum is" + loopSum);



     }
}