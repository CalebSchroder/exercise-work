import java.util.Scanner;
public class Mpg {


    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int init;
        int fin;
        int gallons;
        int mpg;

        init = 1;

        while (init >= 0) {
            System.out.println("Initial Miles:");
            init = scan.nextInt();
            if(init >= 0) {
                System.out.println("Final Miles:");
                fin = scan.nextInt();
                System.out.println("Gallons:");
                gallons = scan.nextInt();
                mpg = (fin - init) / gallons;
                System.out.println("Mpg= " + mpg);
            } else {
                System.out.println("Bye");
            }
        }
        

      
     
      
         


     }
}