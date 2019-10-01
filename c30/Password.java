import java.util.*;
public class Password {
    public static void main (String[]args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        String pass;
        String pass1;
        int p;


        System.out.println("Enter Password");
        pass = scan.nextLine();

        pass1 = "";
        int count1 = 0;

        while(!pass1.equals(pass)) {
            for (int count = 0; count < pass.length(); count ++) {
                p = rand.nextInt(26) + 97;
                pass1 = pass1 + String.valueOf(p);
            }
            count1 = count1 + 1;
        }
        System.out.println("Here is the password" + pass1);
        System.out.println("It took this many attempts" + count1);


    }
}